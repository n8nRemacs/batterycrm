package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37193y0 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final C37118e1 f358545b = new C37118e1();

    /* renamed from: c, reason: collision with root package name */
    public final File f358546c;

    /* renamed from: d, reason: collision with root package name */
    public final B1 f358547d;

    /* renamed from: e, reason: collision with root package name */
    public long f358548e;

    /* renamed from: f, reason: collision with root package name */
    public long f358549f;

    /* renamed from: g, reason: collision with root package name */
    public FileOutputStream f358550g;

    /* renamed from: h, reason: collision with root package name */
    public C37105a0 f358551h;

    public C37193y0(File file, B1 b12) {
        this.f358546c = file;
        this.f358547d = b12;
    }

    @Override // java.io.OutputStream
    public final void write(int i12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        write(new byte[]{(byte) i12}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r15, int r16, int r17) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C37193y0.write(byte[], int, int):void");
    }
}
