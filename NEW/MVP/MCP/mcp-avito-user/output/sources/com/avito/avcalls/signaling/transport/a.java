package com.avito.avcalls.signaling.transport;

import com.avito.avcalls.signaling.proto.IncomingMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IncomingMessageParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: IncomingMessageParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.signaling.transport.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10360a {
        static {
            int[] iArr = new int[IncomingMessage.IncomingMessageType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IncomingMessage.IncomingMessageType.Companion companion = IncomingMessage.IncomingMessageType.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IncomingMessage.IncomingMessageType.Companion companion2 = IncomingMessage.IncomingMessageType.INSTANCE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
