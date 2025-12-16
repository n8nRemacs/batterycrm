package com.avito.android.social_management;

import Ag.CallableC13028a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import hx0.InterfaceC41187a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.List;
import javax.inject.Inject;
import jx0.InterfaceC42441a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: SocialManagementInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/m;", "Lcom/avito/android/social_management/k;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social_management.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35046m implements InterfaceC35044k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f284682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41187a f284683b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f284684c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42441a f284685d;

    /* compiled from: SocialManagementInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/social/SocialNetwork;", "socialNetworks", "Lix0/c;", "vkGroupInfo", "Lcom/avito/android/social_management/f;", "apply", "(Ljava/util/List;Ljava/util/List;)Lcom/avito/android/social_management/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.social_management.m$a */
    public static final class a<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T1, T2, R> f284686b = new a<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new C35039f((List) obj, (List) obj2, null, 4, null);
        }
    }

    @Inject
    public C35046m(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k InterfaceC41187a interfaceC41187a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC42441a interfaceC42441a) {
        this.f284682a = interfaceC34401z0;
        this.f284683b = interfaceC41187a;
        this.f284684c = interfaceC35745a5;
        this.f284685d = interfaceC42441a;
    }

    @Override // com.avito.android.social_management.InterfaceC35044k
    @Y61.k
    public final B0 a(@Y61.k String str, @Y61.k String str2) {
        boolean zEquals = str.equals("apple") ? true : str.equals("esia-id");
        InterfaceC34401z0 interfaceC34401z0 = this.f284682a;
        return Y5.a(zEquals ? interfaceC34401z0.y(str, null, str2) : interfaceC34401z0.y(str, str2, null)).x0(this.f284684c.a()).d0(C35045l.f284681b);
    }

    @Override // com.avito.android.social_management.InterfaceC35044k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C35039f> b() {
        B0 b0D0 = Y5.a(this.f284682a.r()).d0(new C35047n(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f284684c;
        return io.reactivex.rxjava3.core.z.K0(b0D0.x0(interfaceC35745a5.a()), kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C35048o(this, null)).F().x0(interfaceC35745a5.a()), a.f284686b);
    }

    @Override // com.avito.android.social_management.InterfaceC35044k
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r c(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC13028a(29, this, str));
    }

    @Override // com.avito.android.social_management.InterfaceC35044k
    @Y61.k
    public final B0 d(@Y61.k String str) {
        return Y5.a(this.f284682a.d(str)).x0(this.f284684c.a()).d0(C35049p.f284690b);
    }
}
