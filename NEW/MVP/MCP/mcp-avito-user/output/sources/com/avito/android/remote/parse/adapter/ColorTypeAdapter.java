package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Color;
import com.avito.android.util.C35787f0;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;

/* compiled from: ColorTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ColorTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/Color;", "_common_network-design_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorTypeAdapter extends TypeAdapter<Color> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34374q f254163a;

    public ColorTypeAdapter() {
        this(null, 1, null);
    }

    @Override // com.google.gson.TypeAdapter
    public final Color read(com.google.gson.stream.a aVar) {
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        String strB = aVar.B();
        if (C43066x.h0(strB, "0x", false)) {
            strB = C43066x.a0(strB, "0x", "#", false);
        }
        this.f254163a.getClass();
        Integer numA = C35787f0.a(strB);
        if (numA != null) {
            return new Color(numA.intValue());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Color color) throws IOException {
        u0 u0Var = u0.f406856a;
        cVar.q(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(color.getValue() & 16777215)}, 1)));
    }

    public ColorTypeAdapter(C34374q c34374q, int i12, C42822w c42822w) {
        this.f254163a = (i12 & 1) != 0 ? new C34374q() : c34374q;
    }
}
