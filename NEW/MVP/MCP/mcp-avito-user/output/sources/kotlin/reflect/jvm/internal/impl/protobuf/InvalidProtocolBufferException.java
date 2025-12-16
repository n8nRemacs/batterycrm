package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes8.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public o f409295b;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f409295b = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
