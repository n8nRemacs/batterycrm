package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.util.J;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: EventMessageEncoder.java */
@J
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f50632a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f50633b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f50632a = byteArrayOutputStream;
        this.f50633b = new DataOutputStream(byteArrayOutputStream);
    }
}
