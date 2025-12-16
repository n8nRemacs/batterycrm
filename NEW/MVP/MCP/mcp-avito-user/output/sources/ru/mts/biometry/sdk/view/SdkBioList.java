package ru.mts.biometry.sdk.view;

import Ca1.k;
import H91.c;
import X41.j;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import g2.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioList;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "", "", "items", "setItems", "(Ljava/util/List;)V", "ru/mts/biometry/sdk/view/h", "ru/mts/biometry/sdk/view/i", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioList extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final float f436539d = c.a(24);

    /* renamed from: b, reason: collision with root package name */
    public float f436540b;

    /* renamed from: c, reason: collision with root package name */
    public final k f436541c;

    @j
    public SdkBioList(@Y61.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f436540b = f436539d;
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_list, this);
        RecyclerView recyclerView = (RecyclerView) d.a(this, R.id.rv_list);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.rv_list)));
        }
        k kVar = new k();
        this.f436541c = kVar;
        if (attributeSet != null) {
            setupAttrs(attributeSet);
        }
        recyclerView.setAdapter(kVar);
        recyclerView.l(new Ca1.l((int) this.f436540b), -1);
        recyclerView.setNestedScrollingEnabled(false);
    }

    private final void setupAttrs(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c.m.f443896d, R.attr.sdkBioListStyle, R.style.Widget_Biometry_List);
        try {
            CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(0);
            if (textArray != null) {
                k kVar = this.f436541c;
                ArrayList arrayList = new ArrayList(textArray.length);
                for (CharSequence charSequence : textArray) {
                    arrayList.add(charSequence.toString());
                }
                kVar.getClass();
                ArrayList arrayList2 = kVar.f2266c;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                kVar.notifyDataSetChanged();
            }
            this.f436540b = typedArrayObtainStyledAttributes.getDimension(1, f436539d);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void setItems(@Y61.k List<String> items) {
        k kVar = this.f436541c;
        kVar.getClass();
        ArrayList arrayList = kVar.f2266c;
        arrayList.clear();
        arrayList.addAll(items);
        kVar.notifyDataSetChanged();
    }

    public /* synthetic */ SdkBioList(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
