package androidx.fragment.app.strictmode;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Violation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Fragment f46599b;

    public /* synthetic */ Violation(Fragment fragment, String str, int i12, C42822w c42822w) {
        this(fragment, (i12 & 2) != 0 ? null : str);
    }

    public Violation(@k Fragment fragment, @l String str) {
        super(str);
        this.f46599b = fragment;
    }
}
