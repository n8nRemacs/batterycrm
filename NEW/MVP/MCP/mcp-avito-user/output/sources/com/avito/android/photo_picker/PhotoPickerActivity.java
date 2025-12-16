package com.avito.android.photo_picker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.photo_permission.PhotoPermissionResult;
import com.avito.android.photo_permission.a;
import com.avito.android.photo_picker.C33270v;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.camera.CameraFragment;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.photo_picker.legacy.InterfaceC33244f;
import com.avito.android.photo_picker.legacy.PhotoPickerInteractorState;
import com.avito.android.photo_picker.legacy.PhotoPickerPresenterState;
import com.avito.android.photo_picker.legacy.di.d;
import com.avito.android.photo_picker.legacy.di.f;
import com.avito.android.util.C35755b0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerActivity.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/photo_picker/legacy/f$a;", "Lcom/avito/android/K;", "Lcom/avito/android/photo_picker/legacy/di/d;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/photo_picker/r;", "Lcom/avito/android/photo_permission/a$a;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPickerActivity extends com.avito.android.ui.activity.a implements InterfaceC33244f.a, com.avito.android.K<com.avito.android.photo_picker.legacy.di.d>, InterfaceC28477j.b, r, a.InterfaceC6567a {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f218778C = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f218779A;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f218781m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC33244f f218782n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC33243e f218783o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.device_orientation.i f218784p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public M f218785q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    @f.a
    public com.avito.konveyor.adapter.j f218786r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    @f.d
    public com.avito.konveyor.adapter.j f218787s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f218788t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f218789u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_permission.b f218790v;

    /* renamed from: x, reason: collision with root package name */
    public com.avito.android.photo_picker.legacy.di.d f218792x;

    /* renamed from: y, reason: collision with root package name */
    public PhotoPickerViewModel f218793y;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Object f218791w = C42727D.b(LazyThreadSafetyMode.f406616d, new c());

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Handler f218794z = new Handler(Looper.getMainLooper());

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f218780B = C42727D.c(new b());

    /* compiled from: PhotoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            InterfaceC33244f interfaceC33244f = PhotoPickerActivity.this.f218782n;
            if (interfaceC33244f == null) {
                interfaceC33244f = null;
            }
            return Boolean.valueOf(interfaceC33244f.h());
        }
    }

    /* compiled from: PhotoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/photo_permission/a;", "invoke", "()Lcom/avito/android/photo_permission/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.photo_permission.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_permission.a invoke() {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            com.avito.android.photo_permission.b bVar = photoPickerActivity.f218790v;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            return new com.avito.android.photo_permission.d(photoPickerActivity, photoPickerActivity.getSupportFragmentManager(), bVar.f218725a);
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.photo_picker;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("type_id");
        String stringExtra2 = getIntent().getStringExtra("operation_id");
        int intExtra = getIntent().getIntExtra("min_photo_count", 0);
        int intExtra2 = getIntent().getIntExtra("max_photo_count", 0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("photo_picker_mode");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = (PhotoPickerIntentFactory.PhotoPickerMode) parcelableExtra;
        com.avito.android.photo_picker.legacy.di.f fVar = new com.avito.android.photo_picker.legacy.di.f(this, stringExtra2, stringExtra, bundle != null ? (PhotoPickerPresenterState) bundle.getParcelable("presenter_state") : null, bundle != null ? (PhotoPickerInteractorState) bundle.getParcelable("interactor_state") : null, intExtra, intExtra2, getIntent().getBooleanExtra("use_re23_style", false));
        d.a aVarA = com.avito.android.photo_picker.legacy.di.a.a();
        aVarA.c((com.avito.android.photo_picker.legacy.di.e) C29972i.a(C29972i.b(this), com.avito.android.photo_picker.legacy.di.e.class));
        aVarA.d(fVar);
        aVarA.e(photoPickerMode);
        aVarA.b(intExtra2);
        aVarA.a(new com.google.gson.d().a());
        com.avito.android.photo_picker.legacy.di.d dVarBuild = aVarA.build();
        this.f218792x = dVarBuild;
        dVarBuild.gm(this);
    }

    public final boolean a2() {
        return ((Boolean) this.f218780B.getValue()).booleanValue();
    }

    @Override // com.avito.android.photo_picker.r
    public final void b(boolean z12) {
        View viewFindViewById = findViewById(R.id.panel_fragment_container);
        D6.G(viewFindViewById, z12);
        viewFindViewById.setEnabled(z12);
    }

    public final void b2() {
        PhotoPickerViewModel photoPickerViewModel = this.f218793y;
        Intent intent = null;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        int size = photoPickerViewModel.f218829Y.size();
        if (size != 0) {
            Intent intentPutExtra = new Intent().setFlags(1).putExtra("operation_id", getIntent().getStringExtra("operation_id"));
            if (size == 1) {
                PhotoPickerViewModel photoPickerViewModel2 = this.f218793y;
                intentPutExtra.setData(((SelectedPhoto) C42745f0.E((photoPickerViewModel2 != null ? photoPickerViewModel2 : null).f218829Y)).f218866b);
            } else {
                PhotoPickerViewModel photoPickerViewModel3 = this.f218793y;
                ArrayList arrayList = (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).f218829Y;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SelectedPhoto) it.next()).f218866b);
                }
                intentPutExtra.putParcelableArrayListExtra("selected_photos", C35755b0.a(arrayList2));
            }
            intent = intentPutExtra;
        }
        setResult(-1, intent);
        finish();
    }

    public final void c2() {
        for (Fragment fragment : getSupportFragmentManager().P()) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.m(fragment);
            hE2.e();
        }
    }

    public final void d2() {
        PhotoPickerViewModel photoPickerViewModel = this.f218793y;
        if ((photoPickerViewModel == null ? null : photoPickerViewModel).f218819O instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
            if (photoPickerViewModel == null) {
                photoPickerViewModel = null;
            }
            CameraFragment cameraFragmentA = com.avito.android.photo_picker.camera.d.a(photoPickerViewModel.f218819O, a2());
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, cameraFragmentA, null);
            hE2.e();
            return;
        }
        u3.l<SimpleTestGroupWithNone> lVar = this.f218789u;
        if (lVar == null) {
            lVar = null;
        }
        boolean zB2 = lVar.f439745a.f439749b.b();
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f218789u;
        if (lVar2 == null) {
            lVar2 = null;
        }
        if (lVar2.f439745a.f439749b.a()) {
            u3.l<SimpleTestGroupWithNone> lVar3 = this.f218789u;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.b();
        }
        if (zB2) {
            PhotoPickerViewModel photoPickerViewModel2 = this.f218793y;
            if (photoPickerViewModel2 == null) {
                photoPickerViewModel2 = null;
            }
            com.avito.android.photo_picker.camera_mvi.CameraFragment cameraFragmentA2 = com.avito.android.photo_picker.camera_mvi.e.a(photoPickerViewModel2.f218820P);
            androidx.fragment.app.H hE3 = getSupportFragmentManager().e();
            hE3.n(R.id.fragment_container, cameraFragmentA2, null);
            hE3.e();
            return;
        }
        PhotoPickerViewModel photoPickerViewModel3 = this.f218793y;
        if (photoPickerViewModel3 == null) {
            photoPickerViewModel3 = null;
        }
        CameraFragment cameraFragmentA3 = com.avito.android.photo_picker.camera.d.a(photoPickerViewModel3.f218819O, a2());
        androidx.fragment.app.H hE4 = getSupportFragmentManager().e();
        hE4.n(R.id.fragment_container, cameraFragmentA3, null);
        hE4.e();
    }

    @Override // com.avito.android.photo_permission.a.InterfaceC6567a
    public final void o3(@Y61.k PhotoPermissionResult photoPermissionResult) {
        if (photoPermissionResult instanceof PhotoPermissionResult.Allow) {
            d2();
        } else {
            boolean z12 = photoPermissionResult instanceof PhotoPermissionResult.Disallow;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r5, int r6, @Y61.l android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r0 = -1
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L5c
            if (r5 != r2) goto L75
            if (r7 == 0) goto L75
            com.avito.android.util.A1 r5 = com.avito.android.util.A1.f318515a
            r5.getClass()
            java.util.ArrayList r5 = com.avito.android.util.A1.a(r7)
            com.avito.android.photo_picker.PhotoPickerViewModel r6 = r4.f218793y
            if (r6 != 0) goto L1b
            r7 = r1
            goto L1c
        L1b:
            r7 = r6
        L1c:
            com.avito.android.photo_picker.PhotoPickerIntentFactory$PhotoPickerMode r7 = r7.f218819O
            boolean r7 = r7 instanceof com.avito.android.photo_picker.PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd
            if (r7 != 0) goto L2b
            if (r6 != 0) goto L25
            r6 = r1
        L25:
            com.avito.android.photo_picker.PhotoPickerIntentFactory$PhotoPickerMode r6 = r6.f218819O
            boolean r6 = r6 instanceof com.avito.android.photo_picker.PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar
            if (r6 == 0) goto L4a
        L2b:
            r4.f218779A = r2
            java.util.Iterator r6 = r5.iterator()
        L31:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r6.next()
            android.net.Uri r7 = (android.net.Uri) r7
            com.avito.android.photo_picker.PhotoPickerViewModel r0 = r4.f218793y
            if (r0 != 0) goto L42
            r0 = r1
        L42:
            com.avito.android.photo_cache.PhotoSource r2 = com.avito.android.photo_cache.PhotoSource.f216296f
            r3 = 12
            com.avito.android.photo_picker.PhotoPickerViewModel.Be(r0, r7, r2, r1, r3)
            goto L31
        L4a:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L75
            android.os.Handler r6 = r4.f218794z
            com.avito.android.photo_picker.s r7 = new com.avito.android.photo_picker.s
            r0 = 1
            r7.<init>(r4, r5, r0)
            r6.post(r7)
            goto L75
        L5c:
            com.avito.android.photo_picker.PhotoPickerViewModel r5 = r4.f218793y
            if (r5 != 0) goto L62
            r6 = r1
            goto L63
        L62:
            r6 = r5
        L63:
            com.avito.android.photo_picker.PhotoPickerIntentFactory$PhotoPickerMode r6 = r6.f218819O
            boolean r6 = r6 instanceof com.avito.android.photo_picker.PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd
            if (r6 != 0) goto L73
            if (r5 != 0) goto L6c
            goto L6d
        L6c:
            r1 = r5
        L6d:
            com.avito.android.photo_picker.PhotoPickerIntentFactory$PhotoPickerMode r5 = r1.f218819O
            boolean r5 = r5 instanceof com.avito.android.photo_picker.PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar
            if (r5 == 0) goto L75
        L73:
            r4.f218779A = r2
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.PhotoPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        PhotoPickerViewModel photoPickerViewModel = this.f218793y;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        photoPickerViewModel.we(false);
    }

    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (a2()) {
            setTheme(R.style.Theme_DesignSystem_Re23);
        }
        M m12 = this.f218785q;
        if (m12 == null) {
            m12 = null;
        }
        PhotoPickerViewModel photoPickerViewModel = (PhotoPickerViewModel) R0.b(this, m12).a(PhotoPickerViewModel.class);
        this.f218793y = photoPickerViewModel;
        photoPickerViewModel.f218825U.observe(this, new C33270v.a(new C33268t(this)));
        PhotoPickerViewModel photoPickerViewModel2 = this.f218793y;
        if (photoPickerViewModel2 == null) {
            photoPickerViewModel2 = null;
        }
        photoPickerViewModel2.f218833c0.observe(this, new C33270v.a(new C33269u(this)));
        InterfaceC33244f interfaceC33244f = this.f218782n;
        if (interfaceC33244f == null) {
            interfaceC33244f = null;
        }
        PhotoPickerViewModel photoPickerViewModel3 = this.f218793y;
        if (photoPickerViewModel3 == null) {
            photoPickerViewModel3 = null;
        }
        interfaceC33244f.m(photoPickerViewModel3);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.photo_picker_root_view);
        InterfaceC33244f interfaceC33244f2 = this.f218782n;
        InterfaceC33244f interfaceC33244f3 = interfaceC33244f2 != null ? interfaceC33244f2 : null;
        InterfaceC28373a interfaceC28373a = this.f218788t;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.photo_list_view.F f12 = new com.avito.android.photo_list_view.F();
        com.avito.konveyor.adapter.j jVar = this.f218786r;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.j jVar3 = this.f218787s;
        com.avito.android.photo_picker.legacy.E e12 = new com.avito.android.photo_picker.legacy.E(viewGroup, interfaceC33244f3, interfaceC28373a2, f12, jVar2, jVar3 != null ? jVar3 : null, null, 64, null);
        InterfaceC33244f interfaceC33244f4 = this.f218782n;
        if (interfaceC33244f4 == null) {
            interfaceC33244f4 = null;
        }
        interfaceC33244f4.v(e12);
        String stringExtra = getIntent().getStringExtra("selected_photo_id");
        if (stringExtra != null) {
            InterfaceC33244f interfaceC33244f5 = this.f218782n;
            if (interfaceC33244f5 == null) {
                interfaceC33244f5 = null;
            }
            interfaceC33244f5.y(stringExtra);
        }
        PhotoPickerViewModel photoPickerViewModel4 = this.f218793y;
        PhotoPickerViewModel photoPickerViewModel5 = photoPickerViewModel4 != null ? photoPickerViewModel4 : null;
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = photoPickerViewModel5.f218819O;
        if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) {
            photoPickerViewModel5.ve();
            photoPickerViewModel5.ke();
        } else if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
            photoPickerViewModel5.ve();
        }
        ((com.avito.android.photo_permission.a) this.f218791w.getValue()).c(this);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC33244f interfaceC33244f = this.f218782n;
        if (interfaceC33244f == null) {
            interfaceC33244f = null;
        }
        interfaceC33244f.e0();
        this.f218794z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, @Y61.k KeyEvent keyEvent) {
        if (i12 != 24 && i12 != 25) {
            return super.onKeyDown(i12, keyEvent);
        }
        PhotoPickerViewModel photoPickerViewModel = this.f218793y;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        photoPickerViewModel.f218823S.accept(G0.f406611a);
        return true;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.avito.android.device_orientation.i iVar = this.f218784p;
        if (iVar == null) {
            iVar = null;
        }
        iVar.stop();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (this.f218779A) {
            PhotoPickerViewModel photoPickerViewModel = this.f218793y;
            if (photoPickerViewModel == null) {
                photoPickerViewModel = null;
            }
            PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = photoPickerViewModel.f218819O;
            if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) {
                photoPickerViewModel.ve();
                photoPickerViewModel.ke();
            } else if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
                photoPickerViewModel.ve();
            }
            this.f218779A = false;
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.avito.android.device_orientation.i iVar = this.f218784p;
        if (iVar == null) {
            iVar = null;
        }
        iVar.start();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        InterfaceC33244f interfaceC33244f = this.f218782n;
        if (interfaceC33244f == null) {
            interfaceC33244f = null;
        }
        bundle.putParcelable("presenter_state", interfaceC33244f.getState());
        InterfaceC33243e interfaceC33243e = this.f218783o;
        bundle.putParcelable("interactor_state", (interfaceC33243e != null ? interfaceC33243e : null).getState());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC33244f interfaceC33244f = this.f218782n;
        if (interfaceC33244f == null) {
            interfaceC33244f = null;
        }
        interfaceC33244f.t(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC33244f interfaceC33244f = this.f218782n;
        if (interfaceC33244f == null) {
            interfaceC33244f = null;
        }
        interfaceC33244f.c0();
        super.onStop();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.photo_picker.legacy.di.d dVar = this.f218792x;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
