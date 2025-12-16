package com.avito.android.photo_picker.legacy;

import android.graphics.PorterDuff;
import android.net.Uri;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.b0;
import com.avito.android.image.enhancement.C30977h;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_picker.PhotoPickerActivity;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_picker.legacy.AbstractC33240b;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import com.avito.android.util.C35809h6;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.V2;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: PhotoPickerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/g;", "Lcom/avito/android/photo_picker/legacy/f;", "Lcom/avito/android/photo_camera_view/E;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.legacy.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33245g implements InterfaceC33244f, com.avito.android.photo_camera_view.E {

    /* renamed from: A, reason: collision with root package name */
    public PhotoPickerViewModel f219789A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final ArrayList f219790B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f219791C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f219792D;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f219793a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f219794b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33243e f219795c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.i f219796d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f219797e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219798f;

    /* renamed from: g, reason: collision with root package name */
    public final int f219799g;

    /* renamed from: h, reason: collision with root package name */
    public final int f219800h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.computer_vision.a f219801i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f219802j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final b0 f219803k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final PhotoPickerPresenterState f219804l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f219805m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final HM.a f219806n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f219807o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public E f219808p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f219809q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public PhotoPickerActivity f219810r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f219811s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f219812t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public UV0.c<com.avito.android.photo_picker.legacy.thumbnail_list.a> f219813u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> f219814v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public C30977h f219815w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f219816x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f219817y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, Boolean> f219818z;

    /* compiled from: PhotoPickerPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Landroid/net/Uri;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.legacy.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends Uri, ? extends Boolean>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.photo_picker.legacy.thumbnail_list.l f219820m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f219821n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f219822o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.photo_picker.legacy.thumbnail_list.l lVar, boolean z12, String str) {
            super(1);
            this.f219820m = lVar;
            this.f219821n = z12;
            this.f219822o = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(kotlin.Q<? extends Uri, ? extends Boolean> q12) {
            boolean z12;
            kotlin.Q<? extends Uri, ? extends Boolean> q13 = q12;
            Uri uri = (Uri) q13.f406619b;
            boolean zBooleanValue = ((Boolean) q13.f406620c).booleanValue();
            C33245g c33245g = C33245g.this;
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = c33245g.f219814v;
            if (arrayList == null) {
                arrayList = null;
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z12 = this.f219821n;
                if (!zHasNext) {
                    break;
                }
                com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = (com.avito.android.photo_picker.legacy.thumbnail_list.l) it.next();
                if (kotlin.jvm.internal.L.f(lVar.f219907g, this.f219822o)) {
                    lVar = new com.avito.android.photo_picker.legacy.thumbnail_list.l(lVar.f219881b, uri, lVar.f219906f, lVar.f219882c, lVar.f219883d, lVar.f219907g, (z12 && zBooleanValue) ? EnhanceState.f216288d : EnhanceState.f216287c);
                }
                arrayList2.add(lVar);
            }
            if (zBooleanValue) {
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList3 = c33245g.f219814v;
                if (arrayList3 == null) {
                    arrayList3 = null;
                }
                arrayList3.clear();
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList4 = c33245g.f219814v;
                (arrayList4 != null ? arrayList4 : null).addAll(arrayList2);
                c33245g.G(true);
                c33245g.M();
                c33245g.f219818z.put(this.f219820m.f219907g, Boolean.valueOf(z12));
                c33245g.N(c33245g.f219809q);
            }
            c33245g.f219803k.a(new m80.e(z12));
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPickerPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.legacy.g$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f219823l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("PhotoPickerPresenter", "subscribeContinueClicks", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPickerPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.legacy.g$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            C33245g c33245g = C33245g.this;
            PhotoPickerViewModel photoPickerViewModel = c33245g.f219789A;
            if (photoPickerViewModel == null) {
                photoPickerViewModel = null;
            }
            if (kotlin.jvm.internal.L.f(photoPickerViewModel.f218819O, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null))) {
                PhotoPickerViewModel photoPickerViewModel2 = c33245g.f219789A;
                (photoPickerViewModel2 != null ? photoPickerViewModel2 : null).we(true);
                c33245g.J();
            } else {
                E e12 = c33245g.f219808p;
                if (e12 != null) {
                    c33245g.f219811s.b(A1.e(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.I.q(Boolean.valueOf(c33245g.f219801i.e())), new C33246h(e12)).n(new C33247i(c33245g)).o(new C33248j(c33245g)).h(c33245g.f219805m.C0(c33245g.f219818z)).k(new C33249k(c33245g)).s(c33245g.f219798f.e()), new C33250l(c33245g), new C33251m(c33245g)));
                }
            }
            return G0.f406611a;
        }
    }

    public C33245g(@Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k InterfaceC33243e interfaceC33243e, @Y61.k com.avito.android.device_orientation.i iVar, @Y61.k y yVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, int i12, int i13, @Y61.k com.avito.android.computer_vision.a aVar3, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k b0 b0Var, @Y61.l PhotoPickerPresenterState photoPickerPresenterState, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k HM.a aVar4, boolean z12) {
        this.f219793a = aVar;
        this.f219794b = aVar2;
        this.f219795c = interfaceC33243e;
        this.f219796d = iVar;
        this.f219797e = yVar;
        this.f219798f = interfaceC35745a5;
        this.f219799g = i12;
        this.f219800h = i13;
        this.f219801i = aVar3;
        this.f219802j = interfaceC35863o4;
        this.f219803k = b0Var;
        this.f219804l = photoPickerPresenterState;
        this.f219805m = interfaceC30978i;
        this.f219806n = aVar4;
        this.f219807o = z12;
        this.f219809q = photoPickerPresenterState != null ? photoPickerPresenterState.f219610b : null;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f219811s = cVar;
        List<PickerPhoto> list = C42784z0.f406748b;
        this.f219813u = new UV0.c<>(list);
        this.f219816x = new LinkedHashSet();
        this.f219818z = new HashMap<>();
        List<PickerPhoto> list2 = photoPickerPresenterState != null ? photoPickerPresenterState.f219611c : null;
        this.f219790B = new ArrayList(list2 != null ? list2 : list);
        cVar.b(com.avito.android.util.rx3.r.a(iVar.a().b(C33259v.f219910b), new C33260w(this)));
    }

    public static com.avito.android.photo_picker.legacy.thumbnail_list.l K(PickerPhoto pickerPhoto, String str) {
        Uri uri = pickerPhoto.f219618g;
        if (uri == null) {
            uri = pickerPhoto.f219617f;
        }
        Uri uri2 = uri;
        String str2 = pickerPhoto.f219613b;
        return new com.avito.android.photo_picker.legacy.thumbnail_list.l(str2, uri2, pickerPhoto.f219614c, kotlin.jvm.internal.L.f(str2, str), !(pickerPhoto.f219618g != null), pickerPhoto.f219619h, pickerPhoto.f219620i);
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void D() {
        PhotoPickerActivity photoPickerActivity = this.f219810r;
        if (photoPickerActivity != null) {
            photoPickerActivity.onBackPressed();
        }
    }

    public final boolean E() {
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((com.avito.android.photo_picker.legacy.thumbnail_list.l) it.next()).f219907g == null) {
                    break;
                }
            }
            if (this.f219818z.isEmpty() || this.f219791C || this.f219792D) {
                break;
            }
            return false;
        }
        if (this.f219818z.isEmpty()) {
        }
        return true;
    }

    public final io.reactivex.rxjava3.internal.observers.y F(io.reactivex.rxjava3.core.I i12) {
        C42022u c42022uK = i12.k(new C33252n(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f219798f;
        return (io.reactivex.rxjava3.internal.observers.y) c42022uK.s(interfaceC35745a5.c()).p(new C33253o(this)).j0(interfaceC35745a5.e()).v0(new C33254p(this), new C33255q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void G(boolean z12) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        UV0.c<com.avito.android.photo_picker.legacy.thumbnail_list.a> cVar = new UV0.c<>(arrayList);
        this.f219813u = cVar;
        this.f219794b.c(cVar);
        E e12 = this.f219808p;
        if (e12 != null && (adapter2 = e12.f219584g.getAdapter()) != null) {
            adapter2.notifyDataSetChanged();
        }
        if (z12) {
            this.f219793a.c(this.f219813u);
            E e13 = this.f219808p;
            if (e13 == null || (adapter = e13.f219589l.getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    public final void H(String str, boolean z12) {
        E e12 = this.f219808p;
        if (e12 == null) {
            return;
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.avito.android.photo_picker.legacy.thumbnail_list.l) it.next()).f219881b);
        }
        int iIndexOf = arrayList2.indexOf(str);
        if (iIndexOf != -1) {
            e12.f219584g.post(new androidx.camera.video.internal.audio.q(iIndexOf, 13, e12));
            if (z12) {
                e12.f219590m.l1(iIndexOf);
            }
        }
    }

    public final void I(String str) {
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(str, arrayList);
        if (lVarA == null) {
            this.f219809q = null;
            M();
            N(null);
        } else {
            this.f219809q = str;
            M();
            N(str);
            V2.f318762a.c("PhotoPickerPresenter", "photo set selection with selected true", null);
            lVarA.f219882c = true;
        }
    }

    public final void J() {
        E e12 = this.f219808p;
        if (e12 == null) {
            return;
        }
        io.reactivex.rxjava3.internal.observers.m mVar = this.f219812t;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f219812t = A1.e(C37722i.a(e12.f219592o.f219643a).d0(C33241c.f219642b).S().s(this.f219798f.e()), b.f219823l, new c());
    }

    public final void L() {
        E e12 = this.f219808p;
        if (e12 != null) {
            e12.f219592o.f219643a.setEnabled(this.f219790B.isEmpty());
        }
        E e13 = this.f219808p;
        if (e13 != null) {
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
            if (arrayList == null) {
                arrayList = null;
            }
            boolean z12 = arrayList.size() >= this.f219799g;
            Button button = e13.f219592o.f219643a;
            if (z12) {
                D6.H(button);
            } else {
                D6.g(button);
            }
        }
    }

    public final void M() {
        E e12;
        String str;
        String enhanceNotAllowed;
        int i12;
        C30977h c30977h = this.f219815w;
        if (c30977h == null || (e12 = this.f219808p) == null || (str = this.f219809q) == null) {
            return;
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(str, arrayList);
        if (lVarA == null) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f219816x;
        Uri uri = lVarA.f219905e;
        if (uri == null) {
            uri = lVarA.f219906f;
        }
        boolean zContains = linkedHashSet.contains(uri);
        EnhanceState enhanceState = lVarA.f219908h;
        boolean z12 = zContains || enhanceState == EnhanceState.f216289e;
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = c30977h.f169376d;
        ImagesEnhancementSlotConfig.ToastMessages toastMessages = imagesEnhancementSlotConfig != null ? imagesEnhancementSlotConfig.getToastMessages() : null;
        String str2 = "";
        if (!z12 ? !(toastMessages == null || (enhanceNotAllowed = toastMessages.getEnhanceNotAllowed()) == null) : !(toastMessages == null || (enhanceNotAllowed = toastMessages.getDisableEnhanceNotAllowed()) == null)) {
            str2 = enhanceNotAllowed;
        }
        Object aVar = (lVarA.f219907g == null || z12) ? new AbstractC33240b.a(str2) : enhanceState.f216292b ? AbstractC33240b.C6604b.f219640a : AbstractC33240b.c.f219641a;
        ImageButton imageButton = e12.f219588k;
        D6.G(imageButton, c30977h.f169375c);
        if (aVar.equals(AbstractC33240b.C6604b.f219640a)) {
            i12 = R.color.blue500;
        } else if (aVar.equals(AbstractC33240b.c.f219641a)) {
            i12 = R.color.black;
        } else {
            if (!(aVar instanceof AbstractC33240b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.color.gray20;
        }
        if (aVar instanceof AbstractC33240b.a) {
            imageButton.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(20, e12, aVar));
        } else {
            imageButton.setOnClickListener(new C(e12, 4));
        }
        imageButton.setColorFilter(androidx.core.content.d.getColor(e12.f219578a.getContext(), i12), PorterDuff.Mode.SRC_IN);
    }

    public final void N(String str) {
        Object next;
        List<InterfaceC33208b.a> listE0;
        InterfaceC33208b.a.C6539a c6539a;
        String str2;
        List<InterfaceC33208b.a> listC;
        if (E() || str == null || str.length() == 0) {
            E e12 = this.f219808p;
            if (e12 != null) {
                e12.c(C42784z0.f406748b);
                return;
            }
            return;
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((com.avito.android.photo_picker.legacy.thumbnail_list.l) next).f219881b, str)) {
                    break;
                }
            }
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = (com.avito.android.photo_picker.legacy.thumbnail_list.l) next;
        String str3 = lVar != null ? lVar.f219907g : null;
        HM.a aVar = this.f219806n;
        if (str3 == null || (listC = aVar.c(str3)) == null || (listE0 = C42745f0.E0(listC, 1)) == null) {
            listE0 = C42784z0.f406748b;
        }
        E e13 = this.f219808p;
        if (e13 != null) {
            e13.c(listE0);
        }
        InterfaceC33208b.a aVar2 = (InterfaceC33208b.a) C42745f0.G(listE0);
        if (aVar2 == null || (c6539a = aVar2.f218114e) == null || (str2 = aVar2.f218113d) == null || aVar.b(str2)) {
            return;
        }
        E e14 = this.f219808p;
        if (e14 != null) {
            e14.d(c6539a);
        }
        aVar.a(str2);
        this.f219803k.a(new m80.j(str2));
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void a() {
        E e12 = this.f219808p;
        if (e12 != null) {
            e12.f219593p.k(null);
        }
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void c0() {
        this.f219810r = null;
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void d() {
        ArrayList arrayList;
        Object next;
        String str;
        List<InterfaceC33208b.a> listC;
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        String strSe = photoPickerViewModel.se(this.f219809q);
        if (strSe == null || (listC = this.f219806n.c(strSe)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                String str2 = ((InterfaceC33208b.a) it.next()).f218113d;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        this.f219803k.a(new m80.d(strSe, arrayList));
        String str3 = this.f219809q;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList2 = this.f219814v;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = arrayList2.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(it2.next().f219881b, str3)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList3 = this.f219814v;
            if (arrayList3 == null) {
                arrayList3 = null;
            }
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = arrayList3.get(i12);
            Uri uri = lVar.f219906f;
            if (C35809h6.a(uri)) {
                uri = null;
            }
            if (uri == null) {
                uri = lVar.f219905e;
            }
            if (uri != null) {
                PhotoPickerViewModel photoPickerViewModel2 = this.f219789A;
                if (photoPickerViewModel2 == null) {
                    photoPickerViewModel2 = null;
                }
                photoPickerViewModel2.Ee(uri);
            }
            ArrayList arrayList4 = this.f219790B;
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (kotlin.jvm.internal.L.f(((PickerPhoto) next).f219613b, str3)) {
                        break;
                    }
                }
            }
            v0.a(arrayList4).remove((PickerPhoto) next);
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList5 = this.f219814v;
            if (arrayList5 == null) {
                arrayList5 = null;
            }
            if (arrayList5.isEmpty()) {
                str = null;
            } else {
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList6 = this.f219814v;
                if (arrayList6 == null) {
                    arrayList6 = null;
                }
                int iMin = Math.min(i12, C42745f0.J(arrayList6));
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList7 = this.f219814v;
                if (arrayList7 == null) {
                    arrayList7 = null;
                }
                str = arrayList7.get(iMin).f219881b;
            }
            if (str != null) {
                I(str);
            }
            G(true);
            if (str != null) {
                H(str, true);
            }
            L();
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList8 = this.f219814v;
            if (arrayList8 == null) {
                arrayList8 = null;
            }
            if (arrayList8.isEmpty()) {
                PhotoPickerViewModel photoPickerViewModel3 = this.f219789A;
                if (photoPickerViewModel3 == null) {
                    photoPickerViewModel3 = null;
                }
                if (kotlin.jvm.internal.L.f(photoPickerViewModel3.f218819O, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null))) {
                    PhotoPickerViewModel photoPickerViewModel4 = this.f219789A;
                    (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).we(false);
                } else {
                    PhotoPickerViewModel photoPickerViewModel5 = this.f219789A;
                    if ((photoPickerViewModel5 == null ? null : photoPickerViewModel5).f218819O instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) {
                        (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).me();
                    }
                }
            }
        }
        this.f219792D = true;
        N(this.f219809q);
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void e() {
        String str;
        List<InterfaceC33208b.a> listC;
        InterfaceC33208b.a aVar;
        if (E()) {
            return;
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        Object obj = null;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.L.f(((com.avito.android.photo_picker.legacy.thumbnail_list.l) next).f219881b, this.f219809q)) {
                obj = next;
                break;
            }
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = (com.avito.android.photo_picker.legacy.thumbnail_list.l) obj;
        if (lVar == null || (str = lVar.f219907g) == null || (listC = this.f219806n.c(str)) == null || (aVar = (InterfaceC33208b.a) C42745f0.G(listC)) == null) {
            return;
        }
        String str2 = aVar.f218113d;
        m80.c cVar = new m80.c(str2 == null ? "" : str2);
        b0 b0Var = this.f219803k;
        b0Var.a(cVar);
        InterfaceC33208b.a.C6539a c6539a = aVar.f218114e;
        if (c6539a == null) {
            return;
        }
        b0Var.a(new m80.j(str2 != null ? str2 : ""));
        E e12 = this.f219808p;
        if (e12 != null) {
            e12.d(c6539a);
        }
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void e0() {
        B b12;
        E e12 = this.f219808p;
        if (e12 != null && (b12 = e12.f219591n) != null) {
            e12.f219578a.removeCallbacks(b12);
        }
        this.f219808p = null;
        this.f219811s.e();
        this.f219805m.K();
        io.reactivex.rxjava3.internal.observers.m mVar = this.f219812t;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f219812t = null;
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    @Y61.k
    public final PhotoPickerIntentFactory.PhotoPickerMode getMode() {
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        return photoPickerViewModel.f218819O;
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    @Y61.k
    public final PhotoPickerPresenterState getState() {
        String str = this.f219809q;
        ArrayList arrayList = this.f219790B;
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        return new PhotoPickerPresenterState(str, arrayList, photoPickerViewModel.f218829Y);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    /* renamed from: h, reason: from getter */
    public final boolean getF219807o() {
        return this.f219807o;
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void i(@Y61.k ArrayList arrayList) {
        PhotoSource photoSource = PhotoSource.f216296f;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new SelectedPhoto((Uri) it.next(), photoSource, this.f219802j.a(), null, null, null, null, 120, null));
        }
        j(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void j(@Y61.k ArrayList arrayList) {
        EnhanceState enhanceState;
        G(true);
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        ArrayList arrayListQe = photoPickerViewModel.qe(arrayList);
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList2 = this.f219814v;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        int size = arrayList2.size();
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList3 = this.f219814v;
        if (arrayList3 == null) {
            arrayList3 = null;
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((com.avito.android.photo_picker.legacy.thumbnail_list.l) it.next()).f219881b);
        }
        Set setP0 = C42745f0.P0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayListQe, 10));
        Iterator it2 = arrayListQe.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((SelectedPhoto) it2.next()).f218868d);
        }
        int size2 = b1.h(setP0, C42745f0.P0(arrayList5)).size();
        int i12 = this.f219800h;
        ArrayList arrayListE0 = arrayListQe;
        if (size2 > i12) {
            E e12 = this.f219808p;
            if (e12 != null) {
                e12.e(this.f219797e.a(i12));
            }
            int i13 = i12 - size;
            if (i13 < 0) {
                i13 = 0;
            }
            arrayListE0 = C42745f0.E0(arrayListQe, i13);
        }
        if (arrayListE0.isEmpty()) {
            return;
        }
        ArrayList<SelectedPhoto> arrayList6 = arrayListE0;
        ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList6, 10));
        for (SelectedPhoto selectedPhotoA : arrayList6) {
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList8 = this.f219814v;
            if (arrayList8 == null) {
                arrayList8 = null;
            }
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(selectedPhotoA.f218868d, arrayList8);
            if (lVarA != null && (enhanceState = lVarA.f219908h) != null && enhanceState.f216292b) {
                this.f219816x.add(selectedPhotoA.f218866b);
                this.f219817y = true;
                EnhanceState enhanceState2 = EnhanceState.f216287c;
                selectedPhotoA = SelectedPhoto.a(selectedPhotoA, null, null, null, 63);
            }
            arrayList7.add(selectedPhotoA);
        }
        PhotoPickerViewModel photoPickerViewModel2 = this.f219789A;
        this.f219811s.b(F((photoPickerViewModel2 != null ? photoPickerViewModel2 : null).ne(arrayList7)));
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.d.a
    public final void k(@Y61.k String str) {
        if (str.equals(this.f219809q)) {
            return;
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(this.f219809q, arrayList);
        if (lVarA != null) {
            lVarA.f219882c = false;
        }
        I(str);
        H(str, true);
        G(true);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void m(@Y61.k PhotoPickerViewModel photoPickerViewModel) {
        List<SelectedPhoto> list;
        this.f219789A = photoPickerViewModel;
        PhotoPickerPresenterState photoPickerPresenterState = this.f219804l;
        if (photoPickerPresenterState != null && (list = photoPickerPresenterState.f219612d) != null) {
            for (SelectedPhoto selectedPhoto : list) {
                PhotoPickerViewModel photoPickerViewModel2 = this.f219789A;
                if (photoPickerViewModel2 == null) {
                    photoPickerViewModel2 = null;
                }
                if (photoPickerViewModel2.ye(selectedPhoto.f218866b) == 0) {
                    PhotoPickerViewModel photoPickerViewModel3 = this.f219789A;
                    if (photoPickerViewModel3 == null) {
                        photoPickerViewModel3 = null;
                    }
                    PhotoPickerViewModel.Be(photoPickerViewModel3, selectedPhoto.f218866b, selectedPhoto.f218867c, selectedPhoto.f218868d, 8);
                }
            }
        }
        PhotoPickerViewModel photoPickerViewModel4 = this.f219789A;
        this.f219814v = (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).f218827W;
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void n(int i12) {
        if (i12 >= this.f219813u.getCount() || i12 < 0) {
            return;
        }
        String str = this.f219813u.f16399b.get(i12).f219881b;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(this.f219809q, arrayList);
        if (lVarA != null) {
            lVarA.f219882c = false;
        }
        I(str);
        H(str, false);
        G(false);
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void q() {
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        photoPickerViewModel.oe(this.f219809q);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void s() {
        E e12 = this.f219808p;
        if (e12 != null) {
            e12.f219593p.j();
        }
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void t(@Y61.k PhotoPickerActivity photoPickerActivity) {
        this.f219810r = photoPickerActivity;
    }

    @Override // com.avito.android.photo_list_view.H
    public final void u(int i12, int i13) {
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        if (i13 >= arrayList.size()) {
            return;
        }
        this.f219795c.f(i13, i12);
        PhotoPickerViewModel photoPickerViewModel = this.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        Collections.swap(photoPickerViewModel.f218827W, i12, i13);
        Collections.swap(photoPickerViewModel.f218829Y, i12, i13);
        G(true);
        E e12 = this.f219808p;
        if (e12 != null) {
            e12.b(i12);
        }
        E e13 = this.f219808p;
        if (e13 != null) {
            e13.b(i13);
        }
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList2 = this.f219814v;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        String str = arrayList2.get(i13).f219881b;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList3 = this.f219814v;
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(this.f219809q, arrayList3 != null ? arrayList3 : null);
        if (lVarA != null) {
            lVarA.f219882c = false;
        }
        I(str);
        H(str, true);
        this.f219791C = true;
        N(this.f219809q);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void v(@Y61.k E e12) {
        boolean z12;
        boolean z13;
        PhotoPickerIntentFactory.PhotoPickerMode mode = getMode();
        if (this.f219808p == null && (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit)) {
            this.f219803k.a(m80.g.f414347a);
        }
        this.f219808p = e12;
        L();
        io.reactivex.rxjava3.internal.observers.m mVarE = A1.e(this.f219795c.a().s(this.f219798f.e()), r.f219842l, new C33256s(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f219811s;
        cVar.b(mVarE);
        J();
        InterfaceC30978i interfaceC30978i = this.f219805m;
        cVar.b(A1.h(interfaceC30978i.getState(), null, new C33257t(this), 3));
        cVar.b(A1.h(interfaceC30978i.getError(), null, new C33258u(this), 3));
        D6.G(e12.f219585h, C33261x.b(mode));
        boolean z14 = mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd;
        if (z14 || (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
            z12 = true;
        } else if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) {
            z12 = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) mode).f218811d;
        } else if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView) {
            z12 = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeView) mode).f218812b;
        } else {
            if (!(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = true;
        }
        D6.G(e12.f219584g, z12);
        if (z14 || (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
            z13 = true;
        } else if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) {
            z13 = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) mode).f218809b;
        } else if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView) {
            z13 = false;
        } else {
            if (!(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                throw new NoWhenBranchMatchedException();
            }
            z13 = true;
        }
        D6.G(e12.f219587j, z13);
        D6.G(e12.f219586i, !(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView));
        interfaceC30978i.E0();
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33244f
    public final void y(@Y61.k String str) {
        this.f219809q = str;
        M();
        N(str);
    }

    @Override // com.avito.android.photo_picker.legacy.A.a
    public final void z() {
        String str;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVarA = C33261x.a(this.f219809q, arrayList);
        if (lVarA == null || (str = lVarA.f219907g) == null) {
            return;
        }
        boolean z12 = !lVarA.f219908h.f216292b;
        this.f219811s.b(A1.g(this.f219805m.J0(str, z12).s(this.f219798f.e()), null, new a(lVarA, z12, str), 1));
    }
}
