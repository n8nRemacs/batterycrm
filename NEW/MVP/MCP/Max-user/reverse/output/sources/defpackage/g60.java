package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class g60 implements h37 {
    public long a;
    public long b;
    public long c;
    public final Object d;
    public final Object o;

    public g60(long j, long j2, long j3, k18 k18Var, Set set) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = set;
        this.o = new bwf(new m3(this, 24, k18Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.ArrayList r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g60.a(java.util.ArrayList, int, int):void");
    }

    @Override // defpackage.h37
    public g37 n() {
        return (yj2) ((bwf) this.o).getValue();
    }

    public g60(long j) {
        this.d = new ArrayList();
        this.o = new ArrayList();
        this.c = j;
        this.a = 14400000L;
        this.b = 10;
    }

    public g60(AudioTrack audioTrack) {
        this.d = audioTrack;
        this.o = new AudioTimestamp();
    }
}
