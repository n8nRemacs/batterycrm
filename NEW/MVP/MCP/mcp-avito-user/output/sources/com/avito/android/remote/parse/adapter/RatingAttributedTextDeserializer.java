package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.item_reviews.RatingAttributedTextEntry;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: RatingAttributedTextDeserializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RatingAttributedTextDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/item_reviews/RatingAttributedTextEntry;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RatingAttributedTextDeserializer implements com.google.gson.h<RatingAttributedTextEntry> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedTextAdapter f254210a;

    public RatingAttributedTextDeserializer(@Y61.k AttributedTextAdapter attributedTextAdapter) {
        this.f254210a = attributedTextAdapter;
    }

    @Override // com.google.gson.h
    public final RatingAttributedTextEntry deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return new RatingAttributedTextEntry(this.f254210a.b(gVar, iVar));
    }
}
