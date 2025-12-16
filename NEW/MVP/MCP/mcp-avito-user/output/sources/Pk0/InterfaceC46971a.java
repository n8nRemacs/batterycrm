package pK0;

import Y61.k;
import android.content.Context;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;

/* compiled from: AppearanceChangeableView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpK0/a;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46971a {

    /* compiled from: AppearanceChangeableView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pK0.a$a, reason: collision with other inner class name */
    public static final class C12268a {
        public static void a(@k InterfaceC46971a interfaceC46971a, @InterfaceC42150f int i12) {
            interfaceC46971a.setAppearance(C35835l0.j(i12, interfaceC46971a.getContext()));
        }
    }

    @k
    Context getContext();

    void setAppearance(@f0 int i12);
}
