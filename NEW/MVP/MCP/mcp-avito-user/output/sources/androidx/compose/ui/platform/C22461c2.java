package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.Metadata;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/c2;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.platform.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22461c2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22461c2 f41423a = new C22461c2();

    public static int a(@Y61.k RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(@Y61.k RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(@Y61.k RenderNode renderNode, int i12) {
        renderNode.setAmbientShadowColor(i12);
    }

    public static void d(@Y61.k RenderNode renderNode, int i12) {
        renderNode.setSpotShadowColor(i12);
    }
}
