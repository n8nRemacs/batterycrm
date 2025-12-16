package com.avito.android.messenger.conversation.mvi.data;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DatabaseErrorHandler.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/e;", "Lcom/avito/android/messenger/conversation/mvi/data/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.data.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32016e implements InterfaceC32012a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f190460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MessengerDatabase f190461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31667x f190463d;

    @Inject
    public C32016e(@Y61.k Context context, @Y61.k MessengerDatabase messengerDatabase, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f190460a = context;
        this.f190461b = messengerDatabase;
        this.f190462c = interfaceC35745a5;
        this.f190463d = new C31667x(interfaceC28373a, c30277e1);
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a
    @Y61.k
    @InterfaceC43069u
    public final B0 a(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k String str, @Y61.k Map map) {
        C32013b c32013b = new C32013b(this, str, map);
        zVar.getClass();
        return new C41936b0(zVar, c32013b).B0(C32014c.f190449b).z0(1L).d0(C32015d.f190453b);
    }
}
