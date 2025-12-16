package ru.avito.messenger.internal.gson.adapter;

import android.net.Uri;
import androidx.collection.C20199a;
import com.adjust.sdk.Constants;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.Image;

/* compiled from: ImageTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/ImageTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/Image;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ImageTypeAdapter implements h<Image> {
    @Override // com.google.gson.h
    public final Image deserialize(i iVar, Type type, g gVar) {
        x<String, i> xVar = iVar.i().f362194b;
        C20199a c20199a = new C20199a(xVar.entrySet().size());
        for (Map.Entry<String, i> entry : xVar.entrySet()) {
            String key = entry.getKey();
            Uri uriBuild = Uri.parse(entry.getValue().s());
            String scheme = uriBuild.getScheme();
            if (scheme == null || scheme.length() == 0) {
                uriBuild = uriBuild.buildUpon().scheme(Constants.SCHEME).build();
            }
            c20199a.put(key, uriBuild);
        }
        return new Image(c20199a);
    }
}
