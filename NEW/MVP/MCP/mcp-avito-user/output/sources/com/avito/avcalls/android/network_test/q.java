package com.avito.avcalls.android.network_test;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.random.f;

/* compiled from: NetworkTestRunner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class q extends N implements Y41.l<Integer, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f331830l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Integer num) {
        num.intValue();
        ArrayList arrayList = p.f331827c;
        f.a aVar = kotlin.random.f.f406882b;
        int size = arrayList.size();
        aVar.getClass();
        return String.valueOf(((Character) arrayList.get(kotlin.random.f.f406883c.k(size))).charValue());
    }
}
