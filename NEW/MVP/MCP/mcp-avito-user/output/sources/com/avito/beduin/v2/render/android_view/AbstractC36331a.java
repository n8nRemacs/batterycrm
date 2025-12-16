package com.avito.beduin.v2.render.android_view;

import android.content.Context;
import com.avito.beduin.v2.render.android_view.AbstractC36331a.C10471a;
import com.avito.beduin.v2.theme.AbstractC36354b;
import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u0003*\b\b\u0002\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/a;", "Lcom/avito/beduin/v2/theme/m;", "P", "Output", "Lcom/avito/beduin/v2/render/android_view/a$a;", "Scope", "Lcom/avito/beduin/v2/theme/b;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36331a<P extends com.avito.beduin.v2.theme.m, Output, Scope extends C10471a> extends AbstractC36354b<P, Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f337936a;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/a$a;", "Lcom/avito/beduin/v2/render/android_view/p;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.render.android_view.a$a, reason: collision with other inner class name */
    public static class C10471a implements p {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f337937a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.k f337938b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f337939c;

        public C10471a(@Y61.k Context context, @Y61.k com.avito.beduin.v2.theme.k kVar) {
            this.f337937a = context;
            this.f337938b = kVar;
            this.f337939c = w.a(context);
        }

        public static Integer a(C10471a c10471a, com.avito.beduin.v2.theme.f fVar) {
            return F.a(fVar, c10471a.f337938b, c10471a.f337939c);
        }
    }

    public AbstractC36331a(@Y61.k Context context) {
        this.f337936a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object e(@Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k com.avito.beduin.v2.theme.m mVar, Object obj) {
        return h(g(kVar), obj, mVar);
    }

    @Y61.k
    public Scope g(@Y61.k com.avito.beduin.v2.theme.k kVar) {
        return (Scope) new C10471a(this.f337936a, kVar);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Output f(Output output, @Y61.k P p12) {
        return output;
    }

    public Output h(@Y61.k Scope scope, Output output, @Y61.k P p12) {
        return output;
    }
}
