package com.avito.android.util;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: ErrorPrintableFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/a1;", "", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.a1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC35741a1 {

    /* compiled from: ErrorPrintableFormatter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.a1$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrintableText a(InterfaceC35741a1 interfaceC35741a1, Throwable th2, Y41.l lVar, Y41.l lVar2, int i12) {
            if ((i12 & 2) != 0) {
                lVar = C35756b1.f318824l;
            }
            if ((i12 & 4) != 0) {
                lVar2 = C35764c1.f318853l;
            }
            return interfaceC35741a1.a(th2, lVar, lVar2);
        }
    }

    @Y61.k
    PrintableText a(@Y61.l Throwable th2, @Y61.k Y41.l<? super Throwable, ? extends PrintableText> lVar, @Y61.k Y41.l<? super Throwable, ? extends PrintableText> lVar2);
}
