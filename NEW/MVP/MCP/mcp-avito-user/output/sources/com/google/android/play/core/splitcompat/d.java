package com.google.android.play.core.splitcompat;

import j.N;
import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class d extends v {

    /* renamed from: a, reason: collision with root package name */
    public final File f358657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358658b;

    public d(File file, String str) {
        this.f358657a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f358658b = str;
    }

    @Override // com.google.android.play.core.splitcompat.v
    @N
    public final File a() {
        return this.f358657a;
    }

    @Override // com.google.android.play.core.splitcompat.v
    @N
    public final String b() {
        return this.f358658b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f358657a.equals(vVar.a()) && this.f358658b.equals(vVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f358657a.hashCode() ^ 1000003) * 1000003) ^ this.f358658b.hashCode();
    }

    public final String toString() {
        return AK.c.s(androidx.appcompat.app.r.A("SplitFileInfo{splitFile=", this.f358657a.toString(), ", splitId="), this.f358658b, "}");
    }
}
