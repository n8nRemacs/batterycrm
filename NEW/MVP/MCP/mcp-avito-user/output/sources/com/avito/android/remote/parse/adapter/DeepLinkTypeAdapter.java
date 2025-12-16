package com.avito.android.remote.parse.adapter;

import Jd0.C14188a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: DeepLinkTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DeepLinkTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/deep_linking/links/DeepLink;", "DeepLinkJsonParseException", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeepLinkTypeAdapter extends TypeAdapter<DeepLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.deep_linking.x> f254171a;

    /* compiled from: DeepLinkTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DeepLinkTypeAdapter$DeepLinkJsonParseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeepLinkJsonParseException extends RuntimeException {
    }

    /* compiled from: DeepLinkTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254172a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254172a = iArr;
        }
    }

    public DeepLinkTypeAdapter(@Y61.k h31.e<com.avito.android.deep_linking.x> eVar) {
        this.f254171a = eVar;
    }

    @Override // com.google.gson.TypeAdapter
    public final DeepLink read(com.google.gson.stream.a aVar) throws IOException {
        JsonToken jsonTokenF = aVar.F();
        int i12 = jsonTokenF == null ? -1 : a.f254172a[jsonTokenF.ordinal()];
        if (i12 == 1) {
            return this.f254171a.get().b(aVar.B());
        }
        if (i12 == 2) {
            aVar.L();
            return new NoMatchLink();
        }
        throw new DeepLinkJsonParseException("Wrong DeepLink format. Expected " + JsonToken.f362201g + " or " + JsonToken.f362204j + ", but was " + jsonTokenF + '.');
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, DeepLink deepLink) {
        throw new UnsupportedOperationException();
    }

    public DeepLinkTypeAdapter(@Y61.k com.avito.android.deep_linking.x xVar) {
        this(new C14188a(xVar, 5));
    }
}
