package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: LayoutNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.unit.d f40677a = androidx.compose.ui.unit.f.b();

    @Y61.k
    public static final J0 a(@Y61.k LayoutNode layoutNode) {
        AndroidComposeView androidComposeView = layoutNode.f40641q;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw androidx.compose.foundation.H.s("LayoutNode should be attached to an owner");
    }
}
