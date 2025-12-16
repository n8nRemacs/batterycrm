package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Y41.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oI.AbstractC44648a;

/* compiled from: HistoricalSuggestsNewBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "LoI/a;", "invoke", "(Landroid/content/Context;)LoI/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements l<Context, AbstractC44648a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f233255l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f233255l = bVar;
    }

    @Override // Y41.l
    public final AbstractC44648a invoke(Context context) {
        Context context2 = context;
        b bVar = this.f233255l;
        return bVar.f233257b.a(context2, !r0.Ce(), bVar.f233258c.f231861Y.getNavigation().getCategoryId() != null ? Long.valueOf(r2.intValue()) : null);
    }
}
