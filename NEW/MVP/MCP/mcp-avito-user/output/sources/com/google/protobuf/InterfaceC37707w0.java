package com.google.protobuf;

import com.google.protobuf.AbstractC37663a;
import java.io.OutputStream;

/* compiled from: MessageLite.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC37707w0 extends InterfaceC37709x0 {

    /* compiled from: MessageLite.java */
    /* renamed from: com.google.protobuf.w0$a */
    public interface a extends InterfaceC37709x0, Cloneable {
        @InterfaceC37704v
        AbstractC37663a.AbstractC10747a I2(AbstractC37700t abstractC37700t, M m12);

        InterfaceC37707w0 buildPartial();

        GeneratedMessageLite c5();

        @InterfaceC37704v
        AbstractC37663a.AbstractC10747a h(InterfaceC37707w0 interfaceC37707w0);

        @InterfaceC37704v
        a m2(AbstractC37708x abstractC37708x, M m12);

        @InterfaceC37704v
        AbstractC37663a.AbstractC10747a mergeFrom(byte[] bArr);
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    AbstractC37700t toByteString();

    void writeTo(CodedOutputStream codedOutputStream);

    void writeTo(OutputStream outputStream);
}
