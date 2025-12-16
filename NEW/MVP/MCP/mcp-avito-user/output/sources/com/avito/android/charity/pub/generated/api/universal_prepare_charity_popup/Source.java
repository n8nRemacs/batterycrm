package com.avito.android.charity.pub.generated.api.universal_prepare_charity_popup;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UniversalPrepareCharityPopupRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/charity/pub/generated/api/universal_prepare_charity_popup/Source;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Soa", "Publish", "_avito_charity_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Source {

    @c("publish")
    public static final Source Publish;

    @c("soa")
    public static final Source Soa;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Source[] f118061c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f118062d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118063b;

    static {
        Source source = new Source("Soa", 0, "soa");
        Soa = source;
        Source source2 = new Source("Publish", 1, "publish");
        Publish = source2;
        Source[] sourceArr = {source, source2};
        f118061c = sourceArr;
        f118062d = kotlin.enums.c.a(sourceArr);
    }

    private Source(String str, int i12, String str2) {
        this.f118063b = str2;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) f118061c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f118063b.toString();
    }
}
