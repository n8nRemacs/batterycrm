package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import j.N;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36617b extends BasePendingResult<C36618c> {

    /* renamed from: p, reason: collision with root package name */
    public int f348914p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f348915q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f348916r;

    /* renamed from: s, reason: collision with root package name */
    public final m[] f348917s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f348918t;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* renamed from: com.google.android.gms.common.api.b$a */
    public static final class a {
    }

    public /* synthetic */ C36617b(List list, i iVar, y yVar) {
        super(iVar);
        this.f348918t = new Object();
        int size = list.size();
        this.f348914p = size;
        this.f348917s = new m[size];
        if (list.isEmpty()) {
            setResult(new C36618c(Status.f348900f));
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            m mVar = (m) list.get(i12);
            this.f348917s[i12] = mVar;
            mVar.addStatusListener(new x(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.m
    public final void cancel() {
        super.cancel();
        int i12 = 0;
        while (true) {
            m[] mVarArr = this.f348917s;
            if (i12 >= mVarArr.length) {
                return;
            }
            mVarArr[i12].cancel();
            i12++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @N
    public final r createFailedResult(@N Status status) {
        return new C36618c(status);
    }
}
