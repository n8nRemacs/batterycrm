package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/platform/u0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.platform.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22546y0 implements InterfaceC22530u0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22546y0 f41641b = new C22546y0();

    @Override // androidx.compose.ui.platform.InterfaceC22530u0
    @Y61.k
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect a(@Y61.k Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
        } catch (Exception e12) {
            if (e12 instanceof NoSuchFieldException ? true : e12 instanceof NoSuchMethodException ? true : e12 instanceof IllegalAccessException ? true : e12 instanceof InvocationTargetException) {
                return C22542x0.f41637b.a(activity);
            }
            throw e12;
        }
    }
}
