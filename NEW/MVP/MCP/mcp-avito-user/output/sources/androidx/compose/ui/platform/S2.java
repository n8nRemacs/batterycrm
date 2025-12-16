package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Metadata;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/S2;", "Landroid/database/ContentObserver;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C43108m f41272a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(C43108m c43108m, Handler handler) {
        super(handler);
        this.f41272a = c43108m;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12, Uri uri) {
        this.f41272a.w(kotlin.G0.f406611a);
    }
}
