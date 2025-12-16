package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: FocusFinderCompat.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22480h1 extends kotlin.jvm.internal.N implements Y41.l<View, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f41465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22480h1(int i12) {
        super(1);
        this.f41465l = i12;
    }

    @Override // Y41.l
    public final Boolean invoke(View view) {
        return Boolean.valueOf(view.getId() == this.f41465l);
    }
}
