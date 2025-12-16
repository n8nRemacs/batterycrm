package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAttributedTextPairAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinAttributedTextPairTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinAttributedTextPairTypeAdapter extends TypeAdapter<BeduinAttributedTextPairModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104035a;

    public BeduinAttributedTextPairTypeAdapter(@k Gson gson) {
        this.f104035a = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0214, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[PHI: r8
  0x01fa: PHI (r8v3 com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel$AttributedTextPairPart) = 
  (r8v2 com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel$AttributedTextPairPart)
  (r8v5 com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel$AttributedTextPairPart)
 binds: [B:92:0x01e0, B:97:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel read(com.google.gson.stream.a r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.network.parse.BeduinAttributedTextPairTypeAdapter.read(com.google.gson.stream.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, BeduinAttributedTextPairModel beduinAttributedTextPairModel) {
        throw new UnsupportedOperationException();
    }
}
