package com.avito.android.photo_permission;

import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.core.os.C22777e;
import androidx.transition.C23492c;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.permissions.G;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.u;
import com.avito.android.permissions.z;
import com.avito.android.photo_permission.PhotoPermission;
import com.avito.android.photo_permission.PhotoPermissionDialogFragment;
import com.avito.android.photo_permission.PhotoPermissionResult;
import com.avito.android.photo_permission.f;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35845m2;
import i.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPermissionDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPermissionDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f218699t0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public Banner f218700h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f218701i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextView f218702j0;

    /* renamed from: k0, reason: collision with root package name */
    public Button f218703k0;

    /* renamed from: l0, reason: collision with root package name */
    public Button f218704l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public z f218705m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f218706n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public u f218707o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public G f218708p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_permission.f f218709q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String[]> f218710r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public b f218711s0;

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogFragment$a;", "", "<init>", "()V", "", "CHANGES_ANIMATION_DURATION_MILLIS", "J", "", "KEY_PHOTO_PERMISSION_DATA", "Ljava/lang/String;", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogFragment$b;", "", "a", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f218712a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HashSet f218713b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f218714c;

        /* compiled from: PhotoPermissionDialogFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogFragment$b$a;", "", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f218715a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f218716b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f218717c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final PhotoPermission.Strategy f218718d;

            public a() {
                this(false, false, false, null, 15, null);
            }

            public static a a(a aVar, boolean z12, boolean z13, boolean z14) {
                PhotoPermission.Strategy strategy = aVar.f218718d;
                aVar.getClass();
                return new a(z12, z13, z14, strategy);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f218715a == aVar.f218715a && this.f218716b == aVar.f218716b && this.f218717c == aVar.f218717c && this.f218718d == aVar.f218718d;
            }

            public final int hashCode() {
                return this.f218718d.hashCode() + r.i(r.i(Boolean.hashCode(this.f218715a) * 31, 31, this.f218716b), 31, this.f218717c);
            }

            @Y61.k
            public final String toString() {
                return "PermissionData(isGranted=" + this.f218715a + ", showRationale=" + this.f218716b + ", showSettings=" + this.f218717c + ", strategy=" + this.f218718d + ')';
            }

            public a(boolean z12, boolean z13, boolean z14, @Y61.k PhotoPermission.Strategy strategy) {
                this.f218715a = z12;
                this.f218716b = z13;
                this.f218717c = z14;
                this.f218718d = strategy;
            }

            public /* synthetic */ a(boolean z12, boolean z13, boolean z14, PhotoPermission.Strategy strategy, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? PhotoPermission.Strategy.f218694c : strategy);
            }
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
        public b(@Y61.k Map<String, a> map) {
            this.f218712a = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (!entry.getValue().f218715a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                hashSet.add((String) ((Map.Entry) it.next()).getKey());
            }
            this.f218713b = hashSet;
            ?? r42 = this.f218712a;
            boolean z12 = true;
            if (!r42.isEmpty()) {
                Iterator it2 = r42.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((a) ((Map.Entry) it2.next()).getValue()).f218717c) {
                            z12 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.f218714c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f218712a.equals(((b) obj).f218712a);
        }

        public final int hashCode() {
            return this.f218712a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("DialogState(permissions="), this.f218712a, ')');
        }
    }

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            PhotoPermissionDialogFragment photoPermissionDialogFragment = (PhotoPermissionDialogFragment) this.receiver;
            a aVar = PhotoPermissionDialogFragment.f218699t0;
            photoPermissionDialogFragment.getClass();
            photoPermissionDialogFragment.f218700h0 = (Banner) view2.findViewById(R.id.permission_banner);
            photoPermissionDialogFragment.f218701i0 = (TextView) view2.findViewById(R.id.permission_banner_title);
            photoPermissionDialogFragment.f218702j0 = (TextView) view2.findViewById(R.id.permission_banner_desc);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            PhotoPermissionDialogFragment photoPermissionDialogFragment = (PhotoPermissionDialogFragment) this.receiver;
            a aVar = PhotoPermissionDialogFragment.f218699t0;
            photoPermissionDialogFragment.getClass();
            photoPermissionDialogFragment.f218703k0 = (Button) view2.findViewById(R.id.continue_button);
            photoPermissionDialogFragment.f218704l0 = (Button) view2.findViewById(R.id.permission_button);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.photo_permission.f fVar = PhotoPermissionDialogFragment.this.f218709q0;
            if (fVar == null) {
                fVar = null;
            }
            fVar.a(f.a.C6569a.f218731a);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPermissionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.a f218720l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b.a f218721m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ PhotoPermissionDialogFragment f218722n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b.a aVar, b.a aVar2, PhotoPermissionDialogFragment photoPermissionDialogFragment) {
            super(0);
            this.f218720l = aVar;
            this.f218721m = aVar2;
            this.f218722n = photoPermissionDialogFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a aVar = this.f218721m;
            PhotoPermissionDialogFragment photoPermissionDialogFragment = this.f218722n;
            b.a aVar2 = this.f218720l;
            if (aVar2 != null && aVar != null) {
                boolean z12 = aVar2.f218715a;
                boolean z13 = aVar.f218715a;
                if (z12 && z13) {
                    PhotoPermissionDialogFragment.f5(photoPermissionDialogFragment);
                } else if (z12) {
                    a aVar3 = PhotoPermissionDialogFragment.f218699t0;
                    photoPermissionDialogFragment.j5(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_title_camera), photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_desc_camera), aVar.f218718d);
                } else if (z13) {
                    a aVar4 = PhotoPermissionDialogFragment.f218699t0;
                    photoPermissionDialogFragment.j5(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_title_photo), photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_desc_photo), aVar2.f218718d);
                } else {
                    Button button = photoPermissionDialogFragment.f218703k0;
                    if (button == null) {
                        button = null;
                    }
                    button.setVisibility(8);
                    Button button2 = photoPermissionDialogFragment.f218704l0;
                    if (button2 == null) {
                        button2 = null;
                    }
                    button2.setVisibility(0);
                    Banner banner = photoPermissionDialogFragment.f218700h0;
                    if (banner == null) {
                        banner = null;
                    }
                    banner.setVisibility(0);
                    Banner banner2 = photoPermissionDialogFragment.f218700h0;
                    if (banner2 == null) {
                        banner2 = null;
                    }
                    photoPermissionDialogFragment.k5(banner2, false);
                    TextView textView = photoPermissionDialogFragment.f218701i0;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setText(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_title_all));
                    TextView textView2 = photoPermissionDialogFragment.f218702j0;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setText(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_desc_all));
                    Button button3 = photoPermissionDialogFragment.f218704l0;
                    (button3 != null ? button3 : null).setOnClickListener(new g(photoPermissionDialogFragment, 0));
                }
            } else if (aVar2 != null) {
                if (aVar2.f218715a) {
                    PhotoPermissionDialogFragment.f5(photoPermissionDialogFragment);
                } else {
                    a aVar5 = PhotoPermissionDialogFragment.f218699t0;
                    photoPermissionDialogFragment.j5(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_title_photo), photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_desc_photo), aVar2.f218718d);
                }
            } else if (aVar == null || aVar.f218715a) {
                PhotoPermissionDialogFragment.f5(photoPermissionDialogFragment);
            } else {
                a aVar6 = PhotoPermissionDialogFragment.f218699t0;
                photoPermissionDialogFragment.j5(photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_title_camera), photoPermissionDialogFragment.getResources().getString(R.string.photo_permission_dialog_banner_desc_camera), aVar.f218718d);
            }
            return G0.f406611a;
        }
    }

    public PhotoPermissionDialogFragment() {
        super(0, 1, null);
        this.f218710r0 = registerForActivityResult(new b.k(), new androidx.view.result.a() { // from class: com.avito.android.photo_permission.h
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Map map = (Map) obj;
                PhotoPermissionDialogFragment photoPermissionDialogFragment = this.f218736b;
                ?? r12 = photoPermissionDialogFragment.f218711s0.f218712a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(r12.size()));
                Iterator it = r12.entrySet().iterator();
                while (true) {
                    boolean z12 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    String str = (String) entry.getKey();
                    PhotoPermissionDialogFragment.b.a aVar = (PhotoPermissionDialogFragment.b.a) entry.getValue();
                    Boolean bool = (Boolean) map.get(str);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : aVar.f218715a;
                    boolean zShouldShowRequestPermissionRationale = photoPermissionDialogFragment.shouldShowRequestPermissionRationale(str);
                    boolean z13 = aVar.f218716b;
                    if (!zBooleanValue && !zShouldShowRequestPermissionRationale && !z13) {
                        z12 = true;
                    }
                    linkedHashMap.put(key, PhotoPermissionDialogFragment.b.a.a(aVar, zBooleanValue, zShouldShowRequestPermissionRationale, z12));
                }
                PhotoPermissionDialogFragment.b bVar = new PhotoPermissionDialogFragment.b(linkedHashMap);
                photoPermissionDialogFragment.f218711s0 = bVar;
                photoPermissionDialogFragment.i5(bVar);
                Iterator it2 = photoPermissionDialogFragment.f218711s0.f218712a.entrySet().iterator();
                while (true) {
                    z zVar = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str2 = (String) entry2.getKey();
                    PhotoPermissionDialogFragment.b.a aVar2 = (PhotoPermissionDialogFragment.b.a) entry2.getValue();
                    PermissionState permissionState = aVar2.f218715a ? PermissionState.f215104b : aVar2.f218716b ? PermissionState.f215105c : PermissionState.f215106d;
                    z zVar2 = photoPermissionDialogFragment.f218705m0;
                    if (zVar2 != null) {
                        zVar = zVar2;
                    }
                    zVar.c(permissionState, str2);
                }
                Set setKeySet = map.keySet();
                PhotoPermission.Storage.f218691b.getClass();
                if (setKeySet.contains(PhotoPermission.Storage.f218692c)) {
                    G g12 = photoPermissionDialogFragment.f218708p0;
                    if (g12 == null) {
                        g12 = null;
                    }
                    g12.c();
                }
                PhotoPermission.Camera.f218689b.getClass();
                if (setKeySet.contains(PhotoPermission.Camera.f218690c)) {
                    G g13 = photoPermissionDialogFragment.f218708p0;
                    if (g13 == null) {
                        g13 = null;
                    }
                    g13.n();
                }
                boolean zIsEmpty = photoPermissionDialogFragment.f218711s0.f218713b.isEmpty();
                if (zIsEmpty) {
                    photoPermissionDialogFragment.g5();
                }
                if (zIsEmpty) {
                    return;
                }
                PhotoPermissionDialogFragment.b bVar2 = photoPermissionDialogFragment.f218711s0;
                Set setKeySet2 = map.keySet();
                bVar2.getClass();
                Set set = setKeySet2;
                ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    PhotoPermissionDialogFragment.b.a aVar3 = (PhotoPermissionDialogFragment.b.a) bVar2.f218712a.get((String) it3.next());
                    arrayList.add(Boolean.valueOf(aVar3 != null ? aVar3.f218717c : false));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (!((Boolean) it4.next()).booleanValue()) {
                            return;
                        }
                    }
                }
                InterfaceC35845m2 interfaceC35845m2 = photoPermissionDialogFragment.f218706n0;
                photoPermissionDialogFragment.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).i());
            }
        });
        this.f218711s0 = new b(P0.c());
    }

    public static final void f5(PhotoPermissionDialogFragment photoPermissionDialogFragment) {
        Button button = photoPermissionDialogFragment.f218703k0;
        if (button == null) {
            button = null;
        }
        button.setVisibility(0);
        Button button2 = photoPermissionDialogFragment.f218704l0;
        if (button2 == null) {
            button2 = null;
        }
        button2.setVisibility(8);
        Banner banner = photoPermissionDialogFragment.f218700h0;
        if (banner == null) {
            banner = null;
        }
        banner.setVisibility(8);
        Button button3 = photoPermissionDialogFragment.f218703k0;
        (button3 != null ? button3 : null).setOnClickListener(new g(photoPermissionDialogFragment, 1));
    }

    public final void g5() {
        com.avito.android.photo_permission.f fVar = this.f218709q0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(f.a.b.f218732a);
        getParentFragmentManager().o0(C22777e.b(new Q("com.avito.android.photo_permission_result_bundle_key", PhotoPermissionResult.Allow.f218723b)), "com.avito.android.photo_permission_dialog_request_key");
        dismissAllowingStateLoss();
    }

    public final void h5() {
        boolean zIsEmpty = this.f218711s0.f218713b.isEmpty();
        if (zIsEmpty) {
            g5();
        }
        if (zIsEmpty) {
            return;
        }
        com.avito.android.photo_permission.f fVar = this.f218709q0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(f.a.c.f218733a);
        b bVar = this.f218711s0;
        if (!bVar.f218714c) {
            this.f218710r0.b(bVar.f218713b.toArray(new String[0]));
        } else {
            InterfaceC35845m2 interfaceC35845m2 = this.f218706n0;
            startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).i());
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public final void i5(b bVar) {
        ?? r62 = bVar.f218712a;
        PhotoPermission.Storage.f218691b.getClass();
        b.a aVar = (b.a) r62.get(PhotoPermission.Storage.f218692c);
        PhotoPermission.Camera.f218689b.getClass();
        f fVar = new f(aVar, (b.a) r62.get(PhotoPermission.Camera.f218690c), this);
        Dialog dialog = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
        if (dVar == null) {
            fVar.invoke();
            return;
        }
        C23492c c23492c = new C23492c();
        c23492c.G(new androidx.interpolator.view.animation.b());
        c23492c.E(500L);
        Banner banner = this.f218700h0;
        c23492c.M(banner != null ? banner : null);
        q qVar = dVar.f178530x;
        if (qVar != null) {
            qVar.r(c23492c, fVar);
        }
    }

    public final void j5(String str, String str2, PhotoPermission.Strategy strategy) {
        boolean z12 = strategy == PhotoPermission.Strategy.f218693b;
        Button button = this.f218704l0;
        if (button == null) {
            button = null;
        }
        button.setVisibility(0);
        Banner banner = this.f218700h0;
        if (banner == null) {
            banner = null;
        }
        banner.setVisibility(0);
        Button button2 = this.f218703k0;
        if (button2 == null) {
            button2 = null;
        }
        button2.setVisibility(z12 ? 0 : 8);
        Banner banner2 = this.f218700h0;
        if (banner2 == null) {
            banner2 = null;
        }
        k5(banner2, z12);
        TextView textView = this.f218701i0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        TextView textView2 = this.f218702j0;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(str2);
        Button button3 = this.f218704l0;
        if (button3 == null) {
            button3 = null;
        }
        button3.setOnClickListener(new g(this, 2));
        Button button4 = this.f218703k0;
        (button4 != null ? button4 : null).setOnClickListener(new g(this, 3));
    }

    public final void k5(Banner banner, boolean z12) {
        Context context;
        Dialog dialog = getDialog();
        if (dialog == null || (context = dialog.getContext()) == null) {
            return;
        }
        Banner.h(banner, z12 ? ColorStateList.valueOf(C35835l0.d(R.attr.bannerBackgroundOrange, context)) : ColorStateList.valueOf(C35835l0.d(R.attr.bannerBackgroundRed, context)));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.photo_permission.di.a.a().a(requireContext(), (com.avito.android.photo_permission.di.c) C29972i.a(C29972i.b(this), com.avito.android.photo_permission.di.c.class)).a(this);
        Parcelable parcelable = requireArguments().getParcelable("key_photo_permission_dialog_data");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Map<PhotoPermission, PhotoPermission.Strategy> map = ((PhotoPermissionDialogData) parcelable).f218698b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((PhotoPermission) entry.getKey()).o3(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            boolean z12 = false;
            linkedHashMap2.put(entry2.getKey(), new b.a(z12, false, false, (PhotoPermission.Strategy) entry2.getValue(), 7, null));
        }
        this.f218711s0 = new b(linkedHashMap2);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        Drawable drawableM = C35835l0.m(contextThemeWrapperB, R.attr.ic_arrowBack24, R.attr.black);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, 0, 2, null);
        dVar.B(R.layout.photo_permission_dialog_layout, R.layout.photo_permission_dialog_footer, new c(1, this, PhotoPermissionDialogFragment.class, "setupViews", "setupViews(Landroid/view/View;)V", 0), new d(1, this, PhotoPermissionDialogFragment.class, "setupFooterViews", "setupFooterViews(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, getResources().getString(R.string.photo_permission_dialog_title), true, true, 2);
        dVar.R(new e());
        dVar.z(drawableM);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ?? r02 = this.f218711s0.f218712a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(r02.size()));
        for (Map.Entry entry : r02.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            b.a aVar = (b.a) entry.getValue();
            u uVar = this.f218707o0;
            if (uVar == null) {
                uVar = null;
            }
            linkedHashMap.put(key, b.a.a(aVar, uVar.b(str), shouldShowRequestPermissionRationale(str), false));
        }
        b bVar = new b(linkedHashMap);
        this.f218711s0 = bVar;
        i5(bVar);
        if (this.f218711s0.f218713b.isEmpty()) {
            g5();
        }
    }
}
