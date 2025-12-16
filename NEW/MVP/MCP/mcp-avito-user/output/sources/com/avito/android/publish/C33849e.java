package com.avito.android.publish;

import com.avito.android.publish.slots.contact_info.ContactsData;
import com.avito.android.remote.model.Profile;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactsDataSource.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/e;", "Lcom/avito/android/publish/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33849e implements InterfaceC33544d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f235431a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P f235432b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Pd0.r f235433c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ContactsData> f235434d = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.operators.observable.T0 f235435e;

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/slots/contact_info/ContactsData;", "it", "Lcom/avito/android/remote/model/Profile;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.e$a */
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Profile profile = (Profile) obj;
            C33849e.this.getClass();
            String phone = profile.getPhone();
            if (phone == null) {
                phone = "";
            }
            return new ContactsData(phone, profile.getName(), profile.getEmail(), profile.getManager(), profile.getAvatar(), profile.isShop(), profile.getType().isCompany(), profile.isIncomplete(), profile.getIsPro(), null, false, null, null, 5120, null);
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/slots/contact_info/ContactsData;", "data", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.e$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ContactsData, ContactsData> f235437b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super ContactsData, ContactsData> lVar) {
            this.f235437b = lVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ContactsData contactsDataInvoke;
            ContactsData contactsData = (ContactsData) obj;
            Y41.l<ContactsData, ContactsData> lVar = this.f235437b;
            return (lVar == null || (contactsDataInvoke = lVar.invoke(contactsData)) == null) ? contactsData : contactsDataInvoke;
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_info/ContactsData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.e$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33849e.this.c((ContactsData) obj);
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_info/ContactsData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.e$d */
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33849e.this.f235433c.b();
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.e$e, reason: collision with other inner class name */
    public static final class C7096e<T> implements l41.g {
        public C7096e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33849e.this.f235433c.a((Throwable) obj);
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/publish/slots/contact_info/ContactsData;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.e$f */
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f235441b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(kotlin.G0.f406611a);
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.e$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f235442b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(com.avito.android.error.z.n((Throwable) obj));
        }
    }

    @Inject
    public C33849e(@Y61.k C0 c02, @Y61.k P p12, @Y61.k Pd0.r rVar) {
        this.f235431a = c02;
        this.f235432b = p12;
        this.f235433c = rVar;
    }

    @Override // com.avito.android.publish.InterfaceC33544d
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF235434d() {
        return this.f235434d;
    }

    @Override // com.avito.android.publish.InterfaceC33544d
    @Y61.l
    public final ContactsData b() {
        return this.f235431a.f231874l0;
    }

    @Override // com.avito.android.publish.InterfaceC33544d
    public final void c(@Y61.l ContactsData contactsData) {
        this.f235431a.f231874l0 = contactsData;
        if (contactsData != null) {
            this.f235434d.accept(contactsData);
        }
    }

    @Override // com.avito.android.publish.InterfaceC33544d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<kotlin.G0>> d(@Y61.l Y41.l<? super ContactsData, ContactsData> lVar) {
        if (this.f235431a.f231874l0 != null) {
            return io.reactivex.rxjava3.core.z.c0(new P2.b(kotlin.G0.f406611a));
        }
        this.f235433c.c();
        if (this.f235435e == null) {
            this.f235435e = this.f235432b.a().r(new a()).r(new b(lVar)).F().K(new c()).K(new d()).I(new C7096e()).d0(f.f235441b).m0(g.f235442b).p0();
        }
        return this.f235435e;
    }
}
