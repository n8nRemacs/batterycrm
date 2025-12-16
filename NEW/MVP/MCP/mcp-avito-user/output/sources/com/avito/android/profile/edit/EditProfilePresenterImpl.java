package com.avito.android.profile.edit;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28445v0;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.profile.edit.InterfaceC33315d;
import com.avito.android.profile.edit.S;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import com.avito.android.remote.model.Location;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: EditProfilePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/EditProfilePresenterImpl;", "Lcom/avito/android/profile/edit/x;", "LocationSelecting", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EditProfilePresenterImpl implements InterfaceC33343x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f221959a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33315d f221960b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<EditProfileItem> f221961c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<EditProfileItem> f221962d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f221963e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f221964f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f221965g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public EditProfileActivity f221966h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public S f221967i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public List<? extends EditProfileItem> f221968j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f221969k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f221970l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public LocationSelecting f221971m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f221972n;

    /* compiled from: EditProfilePresenter.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/EditProfilePresenterImpl$LocationSelecting;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocationSelecting implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<LocationSelecting> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Location f221973b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f221974c;

        /* compiled from: EditProfilePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LocationSelecting> {
            @Override // android.os.Parcelable.Creator
            public final LocationSelecting createFromParcel(Parcel parcel) {
                return new LocationSelecting((Location) parcel.readParcelable(LocationSelecting.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LocationSelecting[] newArray(int i12) {
                return new LocationSelecting[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationSelecting() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f221973b, i12);
            parcel.writeString(this.f221974c);
        }

        public LocationSelecting(@Y61.l Location location, @Y61.l String str) {
            this.f221973b = location;
            this.f221974c = str;
        }

        public /* synthetic */ LocationSelecting(Location location, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : location, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            EditProfilePresenterImpl.d(EditProfilePresenterImpl.this, (ProfileAvatar) obj);
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            S s5 = EditProfilePresenterImpl.this.f221967i;
            if (s5 != null) {
                d.a.a(com.avito.android.component.snackbar.d.f125235c, s5.f221998c, R.string.invalid_image_format, 0, new e.b(th2), 0, 1008).b();
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S s5 = EditProfilePresenterImpl.this.f221967i;
            if (s5 != null) {
                s5.e();
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "items", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            EditProfilePresenterImpl editProfilePresenterImpl = EditProfilePresenterImpl.this;
            editProfilePresenterImpl.g((List) obj);
            editProfilePresenterImpl.f();
            S s5 = editProfilePresenterImpl.f221967i;
            if (s5 != null) {
                s5.c();
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S s5 = EditProfilePresenterImpl.this.f221967i;
            if (s5 != null) {
                s5.d();
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            EditProfilePresenterImpl editProfilePresenterImpl = EditProfilePresenterImpl.this;
            S s5 = editProfilePresenterImpl.f221967i;
            if (s5 != null) {
                s5.e();
            }
            S s12 = editProfilePresenterImpl.f221967i;
            if (s12 != null) {
                s12.b(false);
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/d$b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile/edit/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            EditProfilePresenterImpl editProfilePresenterImpl = EditProfilePresenterImpl.this;
            editProfilePresenterImpl.f221971m = null;
            K k12 = new K((InterfaceC33315d.b) obj);
            List<? extends EditProfileItem> list = editProfilePresenterImpl.f221968j;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list);
                k12.invoke(arrayList);
                if (!arrayList.equals(list)) {
                    editProfilePresenterImpl.g(arrayList);
                }
            }
            editProfilePresenterImpl.f221969k = true;
            editProfilePresenterImpl.f();
            S s5 = editProfilePresenterImpl.f221967i;
            if (s5 != null) {
                s5.c();
            }
        }
    }

    /* compiled from: EditProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S s5 = EditProfilePresenterImpl.this.f221967i;
            if (s5 != null) {
                s5.d();
            }
        }
    }

    public EditProfilePresenterImpl(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC33315d interfaceC33315d, @Y61.k io.reactivex.rxjava3.core.z<EditProfileItem> zVar, @Y61.k io.reactivex.rxjava3.core.z<EditProfileItem> zVar2, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Kundle kundle) {
        Boolean boolA;
        Boolean boolA2;
        this.f221959a = interfaceC28373a;
        this.f221960b = interfaceC33315d;
        this.f221961c = zVar;
        this.f221962d = zVar2;
        this.f221963e = aVar;
        this.f221964f = interfaceC35741a1;
        this.f221965g = interfaceC35745a5;
        this.f221968j = kundle != null ? kundle.e("items") : null;
        boolean zBooleanValue = false;
        this.f221969k = (kundle == null || (boolA2 = kundle.a("profile_changed")) == null) ? false : boolA2.booleanValue();
        if (kundle != null && (boolA = kundle.a("avatar_picker_shown")) != null) {
            zBooleanValue = boolA.booleanValue();
        }
        this.f221970l = zBooleanValue;
        this.f221971m = kundle != null ? (LocationSelecting) kundle.d("location_selecting") : null;
        this.f221972n = new io.reactivex.rxjava3.disposables.c();
    }

    public static final void d(EditProfilePresenterImpl editProfilePresenterImpl, ProfileAvatar profileAvatar) {
        List<? extends EditProfileItem> list = editProfilePresenterImpl.f221968j;
        if (list == null) {
            return;
        }
        EditProfileItem editProfileItemA = com.avito.android.profile.edit.refactoring.adapter.e.a(3L, list);
        if (editProfileItemA == null) {
            throw new IllegalArgumentException();
        }
        AvatarItem avatarItem = (AvatarItem) editProfileItemA;
        AvatarItem avatarItem2 = new AvatarItem(avatarItem.f222246b, profileAvatar, avatarItem.f222248d);
        avatarItem2.f222248d = true;
        ArrayList arrayList = new ArrayList(list);
        com.avito.android.profile.edit.refactoring.adapter.e.c(arrayList, avatarItem2);
        editProfilePresenterImpl.g(arrayList);
        editProfilePresenterImpl.f221969k = true;
        editProfilePresenterImpl.f();
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void a(@Y61.k EditProfileActivity editProfileActivity) {
        this.f221966h = editProfileActivity;
        if (this.f221971m == null) {
            i();
            return;
        }
        S s5 = this.f221967i;
        if (s5 != null) {
            s5.d();
        }
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void b(@Y61.k Uri uri) {
        this.f221972n.b(this.f221960b.b(uri).s(this.f221965g.e()).x(new a(), new b()));
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void c(@Y61.k S s5) {
        this.f221967i = s5;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f221961c.t0(new C33345z(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f221972n;
        cVar.b(dVarT0);
        cVar.b(this.f221962d.t0(new B(this)));
        cVar.b(C37722i.a(s5.f222007l).t0(new C(this, s5)));
        cVar.b(C37722i.a(s5.f222006k).t0(new D(this)));
        cVar.b(C37722i.a(s5.f222005j).t0(new E(this, s5)));
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.C(new P(s5, 2)).t0(new F(this)));
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.C(new P(s5, 1)).t0(new G(this)));
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.C(new P(s5, 0)).t0(new H(this)));
        if (this.f221970l) {
            h(s5, false);
        }
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void c0() {
        this.f221966h = null;
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("items", this.f221968j);
        kundle.h(Boolean.valueOf(this.f221970l), "avatar_picker_shown");
        kundle.h(Boolean.valueOf(this.f221969k), "profile_changed");
        kundle.j(this.f221971m, "location_selecting");
        return kundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void e(@Y61.k Location location) {
        this.f221971m = new LocationSelecting(location, null, 2, 0 == true ? 1 : 0);
        j();
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void e0() {
        this.f221972n.e();
        this.f221967i = null;
    }

    public final void f() {
        S s5 = this.f221967i;
        if (s5 != null) {
            s5.b(this.f221969k || this.f221960b.h());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List<? extends com.avito.android.profile.edit.refactoring.adapter.EditProfileItem> r11) {
        /*
            r10 = this;
            r10.f221968j = r11
            UV0.c r0 = new UV0.c
            r0.<init>(r11)
            com.avito.konveyor.adapter.a r1 = r10.f221963e
            r1.c(r0)
            com.avito.android.profile.edit.S r0 = r10.f221967i
            if (r0 == 0) goto Lc6
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C42745f0.q(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L24:
            boolean r5 = r1.hasNext()
            r6 = 0
            r7 = -1
            r8 = 1
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L56
            com.avito.android.profile.edit.refactoring.adapter.EditProfileItem r5 = (com.avito.android.profile.edit.refactoring.adapter.EditProfileItem) r5
            boolean r5 = r5.k4()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = kotlin.collections.C42745f0.K(r9, r11)
            com.avito.android.profile.edit.refactoring.adapter.EditProfileItem r5 = (com.avito.android.profile.edit.refactoring.adapter.EditProfileItem) r5
            if (r5 == 0) goto L49
            boolean r8 = r5.z2()
        L49:
            if (r8 == 0) goto L4c
            goto L4d
        L4c:
            r4 = r7
        L4d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            r4 = r9
            goto L24
        L56:
            kotlin.collections.C42745f0.H0()
            throw r6
        L5a:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r2.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == r7) goto L78
            r4 = r8
            goto L79
        L78:
            r4 = r3
        L79:
            if (r4 == 0) goto L63
            r11.add(r2)
            goto L63
        L7f:
            PV.b r1 = r0.f222001f
            androidx.recyclerview.widget.RecyclerView r2 = r0.f221998c
            if (r1 == 0) goto L88
            r2.r0(r1)
        L88:
            android.content.Context r1 = r0.f221997b
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2131168384(0x7f070c80, float:1.7951068E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r4 = 2131231767(0x7f080417, float:1.8079624E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r4)
            PV.b$a r4 = new PV.b$a
            r4.<init>(r6, r8, r6)
            r4.f13090c = r3
            r4.f13091d = r3
            java.util.Iterator r11 = r11.iterator()
        La9:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r11.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4.b(r1, r3)
            goto La9
        Lbd:
            PV.b r11 = r4.a()
            r2.l(r11, r7)
            r0.f222001f = r11
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.edit.EditProfilePresenterImpl.g(java.util.List):void");
    }

    public final void h(S s5, boolean z12) {
        this.f221970l = true;
        s5.a();
        this.f221959a.c(new com.avito.android.analytics.event.F(1L));
        EditProfileItem editProfileItemA = com.avito.android.profile.edit.refactoring.adapter.e.a(3L, this.f221968j);
        if (editProfileItemA == null) {
            throw new IllegalArgumentException();
        }
        D6.G(s5.f222007l, ((AvatarItem) editProfileItemA).f222247c != null);
        View view = s5.f222004i;
        if (!z12) {
            view.setAlpha(1.0f);
            D6.H(view);
        } else {
            view.setAlpha(0.0f);
            D6.H(view);
            view.animate().setDuration(200L).alpha(1.0f).setListener(new S.b(view));
        }
    }

    public final void i() {
        List<? extends EditProfileItem> list = this.f221968j;
        io.reactivex.rxjava3.core.z zVarC0 = list != null ? io.reactivex.rxjava3.core.z.c0(list) : this.f221960b.a().j0(this.f221965g.e());
        c cVar = new c();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f221972n.b(zVarC0.J(interfaceC43543a, cVar).v0(new d(), new e(), interfaceC43543a));
    }

    @Override // com.avito.android.profile.edit.InterfaceC33343x
    public final void i0() {
        if (this.f221970l) {
            S s5 = this.f221967i;
            if (s5 != null) {
                this.f221970l = false;
                View view = s5.f222004i;
                view.animate().setDuration(200L).alpha(0.0f).setListener(new S.a(view));
                return;
            }
            return;
        }
        S s12 = this.f221967i;
        if (s12 != null) {
            s12.a();
        }
        EditProfileActivity editProfileActivity = this.f221966h;
        if (editProfileActivity != null) {
            editProfileActivity.finish();
        }
        List<? extends EditProfileItem> list = this.f221968j;
        AvatarItem avatarItem = list != null ? (AvatarItem) com.avito.android.profile.edit.refactoring.adapter.e.a(3L, list) : null;
        if (avatarItem != null ? avatarItem.f222248d : false) {
            this.f221959a.c(new C28445v0(1L));
        }
    }

    public final void j() {
        LocationSelecting locationSelecting = this.f221971m;
        if (locationSelecting == null) {
            return;
        }
        I0 i0J0 = this.f221960b.d(locationSelecting.f221973b, locationSelecting.f221974c).j0(this.f221965g.e());
        f fVar = new f();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = i0J0.J(interfaceC43543a, fVar);
        C33344y c33344y = new C33344y(this, 1);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        pJ2.H(gVar, gVar, interfaceC43543a, c33344y).u0(new g(), new h());
    }

    public /* synthetic */ EditProfilePresenterImpl(InterfaceC28373a interfaceC28373a, InterfaceC33315d interfaceC33315d, io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.z zVar2, com.avito.konveyor.adapter.a aVar, InterfaceC35741a1 interfaceC35741a1, InterfaceC35745a5 interfaceC35745a5, Kundle kundle, int i12, C42822w c42822w) {
        this(interfaceC28373a, interfaceC33315d, zVar, zVar2, aVar, interfaceC35741a1, interfaceC35745a5, (i12 & 128) != 0 ? null : kundle);
    }
}
