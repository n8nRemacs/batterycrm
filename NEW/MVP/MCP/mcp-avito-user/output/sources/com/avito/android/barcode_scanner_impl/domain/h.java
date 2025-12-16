package com.avito.android.barcode_scanner_impl.domain;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43059p;

/* compiled from: ChestniyZnakRawValueInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/domain/h;", "Lcom/avito/android/barcode_scanner_impl/domain/d;", "<init>", "()V", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43059p f98911a = new C43059p("[^\\w;+-=/*?!,.><]");

    /* compiled from: ChestniyZnakRawValueInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/domain/h$a;", "", "<init>", "()V", "", "CHESTNIY_ZNAK_FORMAT_PATTERN", "Ljava/lang/String;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.barcode_scanner_impl.domain.d
    @k
    public final String a(@k String str) {
        return this.f98911a.f(str, "");
    }
}
