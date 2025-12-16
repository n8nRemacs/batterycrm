package com.avito.android.widget_filters.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: WidgetFiltersInitialSearchParamsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/n;", "match", "", "invoke", "(Lkotlin/text/n;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.widget_filters.domain.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36155c extends N implements Y41.l<InterfaceC43057n, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C36155c f329850l = new C36155c();

    public C36155c() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(InterfaceC43057n interfaceC43057n) {
        return "[" + C43066x.B0(interfaceC43057n.getValue(), '[', ']') + ']';
    }
}
