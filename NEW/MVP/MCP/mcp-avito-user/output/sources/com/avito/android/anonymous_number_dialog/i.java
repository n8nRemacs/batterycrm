package com.avito.android.anonymous_number_dialog;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: AnonymousNumberDialogHandlerModule_ProvideItemReportHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/i;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f91288b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f91289a;

    /* compiled from: AnonymousNumberDialogHandlerModule_ProvideItemReportHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/i$a;", "", "<init>", "()V", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k g gVar, @Y61.k j jVar) {
        this.f91289a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = this.f91289a;
        f91288b.getClass();
        return new C43834a(AnonymousNumberDialogLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AnonymousNumberDialogLink.class), jVar));
    }
}
