package com.avito.android.remote.model.text;

import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Attribute.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/text/ParametersAttribute;", "Lcom/avito/android/remote/model/text/Attribute;", "()V", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "Lcom/avito/android/remote/model/text/FontParameter;", "getParameters", "()Ljava/util/List;", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ParametersAttribute extends Attribute {
    public ParametersAttribute() {
        super(null);
    }

    @l
    public abstract List<FontParameter> getParameters();
}
