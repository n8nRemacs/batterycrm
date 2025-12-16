package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC37707w0;
import java.io.InputStream;

/* compiled from: AbstractParser.java */
/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37665b<MessageType extends InterfaceC37707w0> implements L0<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    public static final M f362851a = M.b();

    @Override // com.google.protobuf.L0
    public final GeneratedMessageLite a(InputStream inputStream) throws InvalidProtocolBufferException {
        AbstractC37708x abstractC37708xH = AbstractC37708x.h(inputStream);
        GeneratedMessageLite partialFrom = GeneratedMessageLite.parsePartialFrom(((GeneratedMessageLite.c) this).f362682b, abstractC37708xH, f362851a);
        abstractC37708xH.a(0);
        if (partialFrom == null || partialFrom.isInitialized()) {
            return partialFrom;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = partialFrom.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }
}
