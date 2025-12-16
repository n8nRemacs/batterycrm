package ru.avito.messenger.internal.socket_events;

import com.avito.android.remote.model.RawJson;
import kotlin.Metadata;
import l41.o;
import nx0.C44487a;

/* compiled from: SocketEventApiImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/RawJson;", "rawJson", "Lnx0/a;", "apply-SwkS6ac", "(Lcom/avito/android/remote/model/RawJson;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class a<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final a<T, R> f431766b = new a<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return C44487a.a(((RawJson) obj).getValue());
    }
}
