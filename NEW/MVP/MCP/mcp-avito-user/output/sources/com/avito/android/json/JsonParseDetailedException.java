package com.avito.android.json;

import Y61.k;
import Y61.l;
import com.google.gson.JsonParseException;
import kotlin.Metadata;

/* compiled from: JsonParseDetailedException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/json/JsonParseDetailedException;", "Lcom/google/gson/JsonParseException;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JsonParseDetailedException extends JsonParseException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174714b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Exception f174715c;

    public JsonParseDetailedException(@k String str, @l Exception exc) {
        super(exc);
        this.f174714b = str;
        this.f174715c = exc;
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f174715c;
    }
}
