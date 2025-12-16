package com.avito.android.util;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorPrintableFormatter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/printable_text/PrintableText;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.b1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35756b1 extends kotlin.jvm.internal.N implements Y41.l<Throwable, PrintableText> {

    /* renamed from: l, reason: collision with root package name */
    public static final C35756b1 f318824l = new C35756b1();

    public C35756b1() {
        super(1);
    }

    @Override // Y41.l
    public final PrintableText invoke(Throwable th2) {
        return com.avito.android.printable_text.b.c(R.string.network_unavailable_snack, new Serializable[0]);
    }
}
