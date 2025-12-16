package com.avito.android.loyalty.remote.adapter;

import cX.d;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsUniversalImageAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/BadgeDetailsUniversalImageAdapter;", "Lcom/google/gson/h;", "LcX/d;", "<init>", "()V", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgeDetailsUniversalImageAdapter implements h<d> {
    @Override // com.google.gson.h
    public final d deserialize(i iVar, Type type, g gVar) {
        try {
            return new d((UniversalImage) gVar.b(iVar, UniversalImage.class));
        } catch (Exception unused) {
            return new d(null);
        }
    }
}
