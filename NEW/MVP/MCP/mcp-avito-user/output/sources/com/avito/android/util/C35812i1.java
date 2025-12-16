package com.avito.android.util;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ErrorPrintableFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/i1;", "Lcom/avito/android/util/a1;", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.i1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35812i1 implements InterfaceC35741a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f318901a;

    public C35812i1() {
        this(null, 1, null);
    }

    @Override // com.avito.android.util.InterfaceC35741a1
    @Y61.k
    public final PrintableText a(@Y61.l Throwable th2, @Y61.k Y41.l<? super Throwable, ? extends PrintableText> lVar, @Y61.k Y41.l<? super Throwable, ? extends PrintableText> lVar2) {
        return this.f318901a;
    }

    public C35812i1(PrintableText printableText, int i12, C42822w c42822w) {
        this.f318901a = (i12 & 1) != 0 ? com.avito.android.printable_text.b.a() : printableText;
    }
}
