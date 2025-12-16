package Kh;

import Y61.k;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: BarChartVerticalAxisDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh/d;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9618a;

    public d(RecyclerView recyclerView) {
        this.f9618a = recyclerView;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @k
    public final Shader resize(int i12, int i13) {
        float f12 = i12;
        RecyclerView recyclerView = this.f9618a;
        return new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{C35835l0.d(R.attr.white, recyclerView.getContext()), C35835l0.d(R.attr.transparentWhite, recyclerView.getContext())}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
