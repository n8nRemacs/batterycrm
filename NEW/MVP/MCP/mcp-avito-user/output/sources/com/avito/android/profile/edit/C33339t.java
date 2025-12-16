package com.avito.android.profile.edit;

import android.net.Uri;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Profile;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: EditProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/t;", "Lcom/avito/android/profile/edit/d;", "Lcom/avito/android/profile/edit/avatar/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.edit.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33339t implements InterfaceC33315d, com.avito.android.profile.edit.avatar.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V f222293a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.edit.avatar.a f222294b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i0 f222295c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M f222296d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f222297e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f222298f;

    public C33339t(@Y61.k V v12, @Y61.k com.avito.android.profile.edit.avatar.a aVar, @Y61.k i0 i0Var, @Y61.k M m12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Kundle kundle) {
        this.f222293a = v12;
        this.f222294b = aVar;
        this.f222295c = i0Var;
        this.f222296d = m12;
        this.f222297e = interfaceC35745a5;
        this.f222298f = kundle != null ? kundle.g("phone_number") : null;
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<EditProfileItem>> a() {
        return io.reactivex.rxjava3.core.z.K0(this.f222293a.g().x0(this.f222297e.a()).N(C33325f.f222205b).d0(new C33326g(this)), this.f222294b.f().F(), new C33324e(this));
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d, com.avito.android.profile.edit.avatar.a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ProfileAvatar> b(@Y61.k Uri uri) {
        return this.f222294b.b(uri);
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    @Y61.k
    public final List<NameIdEntity> c() {
        return this.f222293a.c();
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    @Y61.k
    public final B0 d(@Y61.l Location location, @Y61.l String str) {
        return this.f222293a.d(location, str).N(r.f222238b).d0(new C33338s(this));
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("phone_number", this.f222298f);
        return kundle;
    }

    @Override // com.avito.android.profile.edit.avatar.a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> e(@Y61.l ProfileAvatar profileAvatar) {
        return this.f222294b.e(profileAvatar);
    }

    @Override // com.avito.android.profile.edit.avatar.a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<org.funktionale.option.a<ProfileAvatar>> f() {
        return this.f222294b.f();
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    @Y61.k
    public final K0 g(@Y61.k List list) {
        List<EditProfileItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (EditProfileItem editProfileItem : list2) {
            arrayList.add(new kotlin.Q(Long.valueOf(editProfileItem.getF80342e()), editProfileItem));
        }
        Map mapP = P0.p(arrayList);
        Object obj = mapP.get(3L);
        AvatarItem avatarItem = obj instanceof AvatarItem ? (AvatarItem) obj : null;
        return this.f222295c.a(mapP).K(new C33336q(this)).T(new C33327h(new C33331l(this, avatarItem)), Integer.MAX_VALUE).T(new C33327h(new C33332m(this)), Integer.MAX_VALUE).l0(new C33335p(this, avatarItem));
    }

    @Override // com.avito.android.profile.edit.InterfaceC33315d
    public final boolean h() {
        Profile profileA = this.f222293a.a();
        return (profileA != null ? profileA.isIncomplete() : false) || this.f222298f != null;
    }

    public final SubLocationItem i() {
        V v12 = this.f222293a;
        if (v12.e() == 0) {
            return null;
        }
        return new SubLocationItem(2L, v12.b(), v12.e(), v12.f(), false, 16, null);
    }

    public /* synthetic */ C33339t(V v12, com.avito.android.profile.edit.avatar.a aVar, i0 i0Var, M m12, InterfaceC35745a5 interfaceC35745a5, Kundle kundle, int i12, C42822w c42822w) {
        this(v12, aVar, i0Var, m12, interfaceC35745a5, (i12 & 32) != 0 ? null : kundle);
    }
}
