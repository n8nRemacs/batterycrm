package com.my.target;

import android.content.Context;
import com.my.target.C37798m;
import com.my.target.G;
import e11.C39848C;

/* renamed from: com.my.target.z0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37824z0 implements C37798m.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C39848C f365231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f365232c;

    public C37824z0(A0 a02, C39848C c39848c) {
        this.f365232c = a02;
        this.f365231b = c39848c;
    }

    @Override // com.my.target.C37798m.a
    public final void a(@j.N Context context) {
        G.a aVar = this.f365232c.f364321i;
        if (aVar != null) {
            aVar.d(this.f365231b, context);
        }
    }
}
