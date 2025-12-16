package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.C22126m3;
import java.io.Serializable;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22460c1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Class<? extends Object>[] f41422a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.C) {
            androidx.compose.runtime.snapshots.C c12 = (androidx.compose.runtime.snapshots.C) obj;
            if (c12.h() != C22126m3.h() && c12.h() != C22126m3.o() && c12.h() != C22126m3.l()) {
                return false;
            }
            T value = c12.getValue();
            if (value == 0) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof InterfaceC43072x) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = f41422a;
        for (int i12 = 0; i12 < 7; i12++) {
            if (clsArr[i12].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
