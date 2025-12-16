package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.od, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39027od implements IExecutionPolicy {

    /* renamed from: c, reason: collision with root package name */
    private static final EnumSet<H1.d> f381247c = EnumSet.of(H1.d.OFFLINE);

    /* renamed from: a, reason: collision with root package name */
    private Rl f381248a = new Ml();

    /* renamed from: b, reason: collision with root package name */
    private final Context f381249b;

    public C39027od(@j.N Context context) {
        this.f381249b = context;
    }

    @Override // com.yandex.metrica.networktasks.api.IExecutionPolicy
    public boolean canBeExecuted() {
        Rl rl2 = this.f381248a;
        Context context = this.f381249b;
        ((Ml) rl2).getClass();
        return !f381247c.contains(H1.a(context));
    }
}
