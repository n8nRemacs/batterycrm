package com.avito.android.remote.parse.adapter.stream_gson.font_parameter;

import Y61.k;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.TextAlignment;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.A;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FontParameterSafeTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/font_parameter/FontParameterSafeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/text/FontParameter;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FontParameterSafeTypeAdapter extends TypeAdapter<FontParameter> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254308a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f254309b = C42727D.c(new b());

    /* compiled from: FontParameterSafeTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/font_parameter/FontParameterSafeTypeAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FontParameterSafeTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/gson/TypeAdapter;", "Lcom/google/gson/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/google/gson/TypeAdapter;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<TypeAdapter<i>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TypeAdapter<i> invoke() {
            return FontParameterSafeTypeAdapter.this.f254308a.g(i.class);
        }
    }

    static {
        new a(null);
    }

    public FontParameterSafeTypeAdapter(@k Gson gson) {
        this.f254308a = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FontParameter read(com.google.gson.stream.a aVar) throws IOException {
        FontParameter colorParameter;
        Float fValueOf;
        String strE;
        Float fValueOf2;
        String strE2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        textAlignment = null;
        textAlignment = null;
        textAlignment = null;
        TextAlignment textAlignment = null;
        String strB = null;
        Object obj = null;
        while (aVar.k()) {
            if (aVar.F() != JsonToken.f362200f) {
                aVar.L();
            } else {
                String strX = aVar.x();
                if (L.f(strX, "type")) {
                    strB = aVar.B();
                } else {
                    boolean zF2 = L.f(strX, "value");
                    InterfaceC42726C interfaceC42726C = this.f254309b;
                    if (zF2) {
                        obj = ((TypeAdapter) interfaceC42726C.getValue()).read(aVar);
                    } else {
                        linkedHashMap.put(strX, ((TypeAdapter) interfaceC42726C.getValue()).read(aVar));
                    }
                }
            }
        }
        aVar.g();
        if (strB != null) {
            switch (strB.hashCode()) {
                case -1565881260:
                    if (strB.equals("fontColor")) {
                        i iVar = (i) obj;
                        Gson gson = this.f254308a;
                        gson.getClass();
                        Color color = (Color) A.b(Color.class).cast(iVar == null ? null : gson.c(new com.google.gson.internal.bind.a(iVar), Color.class));
                        i iVar2 = (i) linkedHashMap.get("valueDark");
                        Color color2 = iVar2 != null ? (Color) A.b(Color.class).cast(gson.c(new com.google.gson.internal.bind.a(iVar2), Color.class)) : null;
                        i iVar3 = (i) linkedHashMap.get("valueName");
                        colorParameter = new FontParameter.ColorParameter(color, color2, iVar3 != null ? C34328m0.e(iVar3) : null);
                        break;
                    }
                    break;
                case -1556686091:
                    if (strB.equals("paragraphSpacing")) {
                        i iVar4 = (i) obj;
                        if (iVar4 == null || (fValueOf = Float.valueOf(iVar4.j().t())) == null) {
                            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Unexpected type of paragraphSpacingRelative "));
                        }
                        return new FontParameter.ParagraphSpacingParameter(fValueOf.floatValue());
                    }
                    break;
                case -1550943582:
                    if (strB.equals("fontStyle")) {
                        i iVar5 = (i) obj;
                        if (iVar5 == null || (strE = C34328m0.e(iVar5.j())) == null) {
                            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Unexpected type of style "));
                        }
                        return new FontParameter.StyleParameter(strE);
                    }
                    break;
                case -1048634236:
                    if (strB.equals("textStyle")) {
                        i iVar6 = (i) obj;
                        String strE3 = iVar6 != null ? C34328m0.e(iVar6) : null;
                        i iVar7 = (i) linkedHashMap.get(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
                        colorParameter = new FontParameter.TextStyleParameter(iVar7 != null ? C34328m0.e(iVar7) : null, strE3);
                        break;
                    }
                    break;
                case -1026963764:
                    if (strB.equals("underline")) {
                        return FontParameter.UnderlineParameter.INSTANCE;
                    }
                    break;
                case 470381793:
                    if (strB.equals("paragraphSpacingRelative")) {
                        i iVar8 = (i) obj;
                        if (iVar8 == null || (fValueOf2 = Float.valueOf(iVar8.j().t())) == null) {
                            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Unexpected type of paragraphSpacingRelative "));
                        }
                        return new FontParameter.ParagraphSpacingRelativeParameter(fValueOf2.floatValue());
                    }
                    break;
                case 692131507:
                    if (strB.equals("strikeThrough")) {
                        return FontParameter.StrikethroughParameter.INSTANCE;
                    }
                    break;
                case 1885943515:
                    if (strB.equals("useParagraphing")) {
                        return new FontParameter.UseParagraphingParameter();
                    }
                    break;
                case 2042756918:
                    if (strB.equals("textAlignment")) {
                        i iVar9 = (i) obj;
                        if (iVar9 == null || (strE2 = C34328m0.e(iVar9.j())) == null) {
                            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Unexpected type of textAlignment "));
                        }
                        int iHashCode = strE2.hashCode();
                        if (iHashCode != -1364013995) {
                            if (iHashCode != 3317767) {
                                if (iHashCode == 108511772 && strE2.equals("right")) {
                                    textAlignment = TextAlignment.RIGHT;
                                }
                            } else if (strE2.equals("left")) {
                                textAlignment = TextAlignment.LEFT;
                            }
                        } else if (strE2.equals("center")) {
                            textAlignment = TextAlignment.CENTER;
                        }
                        return new FontParameter.TextAlignmentParameter(textAlignment);
                    }
                    break;
            }
            return colorParameter;
        }
        V2.f318762a.d("FontParameterSafeTypeAdapter", "Unexpected type: " + strB);
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, FontParameter fontParameter) {
        throw new UnsupportedOperationException();
    }
}
