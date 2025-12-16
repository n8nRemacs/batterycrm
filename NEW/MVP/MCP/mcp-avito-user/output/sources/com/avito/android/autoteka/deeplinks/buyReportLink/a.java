package com.avito.android.autoteka.deeplinks.buyReportLink;

import Ju.AbstractC14250d;
import Y41.l;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: AutotekaBuyReportLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<AbstractC14250d> f96244l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f96245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l0.h<AbstractC14250d> hVar, b bVar) {
        super(1);
        this.f96244l = hVar;
        this.f96245m = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ju.d$b, T] */
    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        this.f96244l.f406842b = AbstractC14250d.b.f9170c;
        this.f96245m.f96249g.Y1(R.string.error_open_autoteka_teaser_link_text);
        return G0.f406611a;
    }
}
