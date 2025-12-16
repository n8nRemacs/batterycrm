package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: EventMessageEncoder.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f345646a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f345647b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f345646a = byteArrayOutputStream;
        this.f345647b = new DataOutputStream(byteArrayOutputStream);
    }
}
