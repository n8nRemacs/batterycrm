package NN;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.select.C34611b;
import com.avito.android.select.InterfaceC34610a;
import j.InterfaceC42156l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FilterColorIconAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNN/a;", "LNN/c;", "Lcom/avito/android/select/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements c, InterfaceC34610a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C34611b f11393a;

    @Inject
    public a(@k C34611b c34611b) {
        this.f11393a = c34611b;
    }

    @Override // NN.c, com.avito.android.select.InterfaceC34610a
    @l
    public final Drawable a(@k Context context, @l String str, @l @InterfaceC42156l Integer num) {
        return this.f11393a.a(context, str, num);
    }
}
