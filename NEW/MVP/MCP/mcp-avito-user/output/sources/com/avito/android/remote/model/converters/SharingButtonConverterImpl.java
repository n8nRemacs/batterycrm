package com.avito.android.remote.model.converters;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SharingButton;
import com.avito.android.remote.model.ToolbarShareButton;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SharingButtonConverter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/converters/SharingButtonConverterImpl;", "Lcom/avito/android/remote/model/converters/SharingButtonConverter;", "()V", "convert", "Lcom/avito/android/remote/model/ToolbarShareButton;", "sharingButton", "Lcom/avito/android/remote/model/SharingButton;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SharingButtonConverterImpl implements SharingButtonConverter {
    @Inject
    public SharingButtonConverterImpl() {
    }

    @Override // com.avito.android.remote.model.converters.SharingButtonConverter
    @l
    public ToolbarShareButton convert(@k SharingButton sharingButton) {
        String title = sharingButton.getTitle();
        String url = sharingButton.getUrl();
        if (title == null || url == null) {
            return null;
        }
        return new ToolbarShareButton(url, title);
    }
}
