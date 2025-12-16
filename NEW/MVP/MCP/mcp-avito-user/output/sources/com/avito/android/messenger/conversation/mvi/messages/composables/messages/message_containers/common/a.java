package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.avito.android.messenger.conversation.T1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageBubbleShapeFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_containers/common/a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f192340a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f192341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final n f192342c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final n f192343d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final n f192344e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final n f192345f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final n f192346g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final n f192347h;

    static {
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f192341b = o.b(f12, f12, f12, f12);
        float f13 = 6;
        f192342c = o.b(f12, f12, f13, f12);
        f192343d = o.b(f12, f12, f12, f13);
        f192344e = o.b(f13, f12, f12, f12);
        f192345f = o.b(f12, f13, f12, f12);
        f192346g = o.b(f13, f12, f12, f13);
        f192347h = o.b(f12, f13, f13, f12);
    }

    public static n a(T1.c cVar, n nVar, n nVar2, n nVar3) {
        n nVar4 = f192341b;
        if (cVar != null) {
            boolean z12 = cVar.f189154h;
            boolean z13 = cVar.f189152f;
            boolean z14 = cVar.f189150d;
            boolean z15 = cVar.f189148b;
            boolean z16 = cVar.f189153g;
            boolean z17 = cVar.f189151e;
            boolean z18 = cVar.f189149c;
            boolean z19 = cVar.f189147a;
            if ((!z19 && !z18 && !z17 && !z16) || (!z15 && !z14 && !z13 && !z12)) {
                return (z19 || z18 || z17 || z16) ? nVar : (z15 || z14 || z13 || z12) ? nVar2 : nVar3;
            }
        }
        return nVar4;
    }
}
