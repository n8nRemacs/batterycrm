package com.avito.android.rating.user_contacts.mvi;

import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: UserContactsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.b<UserContactsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f247816a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f247817b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f247818c;

    /* compiled from: UserContactsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/f$a;", "", "<init>", "()V", "", "REQ_KEY_USER_CONTACTS", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k n nVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, boolean z12) {
        this.f247816a = nVar;
        this.f247817b = aVar;
        this.f247818c = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UserContactsInternalAction> a() {
        boolean z12 = this.f247818c;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f247817b;
        return !z12 ? C43175k.N(C43175k.G(new i(this, null)), new h(new g(y.a(aVar.V9())))) : new h(new g(y.a(aVar.V9())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
