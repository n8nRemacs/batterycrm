package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

/* compiled from: AndroidUriHandler.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/l0;", "Landroidx/compose/ui/platform/r2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22495l0 implements InterfaceC22520r2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f41487a;

    public C22495l0(@Y61.k Context context) {
        this.f41487a = context;
    }

    @Override // androidx.compose.ui.platform.InterfaceC22520r2
    public final void a(@Y61.k String str) {
        try {
            this.f41487a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e12) {
            throw new IllegalArgumentException(C22491k0.a('.', "Can't open ", str), e12);
        }
    }
}
