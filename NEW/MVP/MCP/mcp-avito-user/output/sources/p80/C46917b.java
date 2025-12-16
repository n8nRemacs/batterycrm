package p80;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoPickerFilesWiper.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp80/b;", "Lp80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p80.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46917b implements InterfaceC46916a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.photo_cache.b f428204a;

    @Inject
    public C46917b(@k com.avito.android.photo_cache.b bVar) {
        this.f428204a = bVar;
    }

    @Override // p80.InterfaceC46916a
    public final void a() {
        this.f428204a.d("PHOTO_PICKER_UPLOAD_TYPE");
    }
}
