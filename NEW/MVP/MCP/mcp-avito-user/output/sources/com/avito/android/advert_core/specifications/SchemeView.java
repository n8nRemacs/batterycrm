package com.avito.android.advert_core.specifications;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.remote.model.ModelSpecifications;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SchemeView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/advert_core/specifications/SchemeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/remote/model/ModelSpecifications$Scheme;", "scheme", "Lkotlin/G0;", "setScheme", "(Lcom/avito/android/remote/model/ModelSpecifications$Scheme;)V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SchemeView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final float f84357b;

    /* renamed from: c, reason: collision with root package name */
    public final float f84358c;

    /* renamed from: d, reason: collision with root package name */
    public final float f84359d;

    /* renamed from: e, reason: collision with root package name */
    public final float f84360e;

    /* renamed from: f, reason: collision with root package name */
    public SimpleDraweeView f84361f;

    /* renamed from: g, reason: collision with root package name */
    public View f84362g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f84363h;

    /* renamed from: i, reason: collision with root package name */
    public View f84364i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f84365j;

    /* renamed from: k, reason: collision with root package name */
    public View f84366k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f84367l;

    /* renamed from: m, reason: collision with root package name */
    public View f84368m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f84369n;

    /* renamed from: o, reason: collision with root package name */
    public int f84370o;

    /* renamed from: p, reason: collision with root package name */
    public int f84371p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f84372q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84373r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public ModelSpecifications.Scheme f84374s;

    public SchemeView(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84357b = 0.035f;
        this.f84358c = 0.015f;
        this.f84359d = 0.09f;
        this.f84360e = 0.045f;
        this.f84372q = true;
    }

    public static void a(View view, int i12, int i13) {
        int measuredWidth = view.getMeasuredWidth();
        int i14 = i12 - (measuredWidth / 2);
        int measuredHeight = view.getMeasuredHeight();
        int i15 = i13 - (measuredHeight / 2);
        view.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    public static void b(TextView textView, View view, ModelSpecifications.Line line) {
        String label;
        if (line == null || (label = line.getLabel()) == null || label.length() == 0) {
            view.setVisibility(8);
            textView.setText("");
            textView.setVisibility(8);
        } else {
            view.setVisibility(0);
            textView.setText(line.getLabel());
            textView.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.image) {
            this.f84361f = (SimpleDraweeView) view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.left_line) {
            this.f84362g = view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.left_label) {
            this.f84363h = (TextView) view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.top_line) {
            this.f84364i = view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.top_label) {
            this.f84365j = (TextView) view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.right_line) {
            this.f84366k = view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.right_label) {
            this.f84367l = (TextView) view;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.bottom_line) {
            this.f84368m = view;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.bottom_label) {
            this.f84369n = (TextView) view;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        ModelSpecifications.Scheme scheme = this.f84374s;
        if (scheme != null) {
            int i16 = i14 - i12;
            int i17 = i15 - i13;
            float f12 = i16;
            int i18 = (int) (this.f84358c * f12);
            int i19 = (int) (f12 * this.f84357b);
            float f13 = i17;
            int i22 = (int) (this.f84360e * f13);
            int i23 = (int) (f13 * this.f84359d);
            int measuredHeight4 = 0;
            if (scheme.getLeft() != null) {
                TextView textView = this.f84363h;
                if (textView == null) {
                    textView = null;
                }
                measuredHeight = textView.getMeasuredHeight() + i18 + i19;
            } else {
                measuredHeight = 0;
            }
            if (scheme.getRight() != null) {
                TextView textView2 = this.f84367l;
                if (textView2 == null) {
                    textView2 = null;
                }
                measuredHeight2 = textView2.getMeasuredHeight() + i18 + i19;
            } else {
                measuredHeight2 = 0;
            }
            if (scheme.getTop() != null) {
                TextView textView3 = this.f84365j;
                if (textView3 == null) {
                    textView3 = null;
                }
                measuredHeight3 = textView3.getMeasuredHeight() + i22 + i23;
            } else {
                measuredHeight3 = 0;
            }
            if (scheme.getBottom() != null) {
                TextView textView4 = this.f84369n;
                if (textView4 == null) {
                    textView4 = null;
                }
                measuredHeight4 = textView4.getMeasuredHeight() + i22 + i23;
            }
            int i24 = (i16 - measuredHeight) - measuredHeight2;
            int i25 = (i17 - measuredHeight3) - measuredHeight4;
            SimpleDraweeView simpleDraweeView = this.f84361f;
            if (simpleDraweeView == null) {
                simpleDraweeView = null;
            }
            simpleDraweeView.layout(measuredHeight, measuredHeight3, i16 - measuredHeight2, i17 - measuredHeight4);
            ModelSpecifications.Line left = scheme.getLeft();
            if (left != null) {
                int from = ((int) (i25 * ((left.getFrom() + left.getTo()) / 2))) + measuredHeight3;
                TextView textView5 = this.f84363h;
                if (textView5 == null) {
                    textView5 = null;
                }
                int measuredHeight5 = textView5.getMeasuredHeight() / 2;
                TextView textView6 = this.f84363h;
                if (textView6 == null) {
                    textView6 = null;
                }
                a(textView6, measuredHeight5, from);
                TextView textView7 = this.f84363h;
                if (textView7 == null) {
                    textView7 = null;
                }
                int measuredHeight6 = textView7.getMeasuredHeight() + i18;
                View view = this.f84362g;
                if (view == null) {
                    view = null;
                }
                int measuredWidth = (view.getMeasuredWidth() / 2) + measuredHeight6;
                View view2 = this.f84362g;
                if (view2 == null) {
                    view2 = null;
                }
                a(view2, measuredWidth, from);
            }
            ModelSpecifications.Line top = scheme.getTop();
            if (top != null) {
                int from2 = ((int) (i24 * ((top.getFrom() + top.getTo()) / 2))) + measuredHeight;
                TextView textView8 = this.f84365j;
                if (textView8 == null) {
                    textView8 = null;
                }
                int measuredHeight7 = textView8.getMeasuredHeight() / 2;
                TextView textView9 = this.f84365j;
                if (textView9 == null) {
                    textView9 = null;
                }
                a(textView9, from2, measuredHeight7);
                TextView textView10 = this.f84365j;
                if (textView10 == null) {
                    textView10 = null;
                }
                int measuredHeight8 = textView10.getMeasuredHeight() + i22;
                View view3 = this.f84364i;
                if (view3 == null) {
                    view3 = null;
                }
                int measuredHeight9 = (view3.getMeasuredHeight() / 2) + measuredHeight8;
                View view4 = this.f84364i;
                if (view4 == null) {
                    view4 = null;
                }
                a(view4, from2, measuredHeight9);
            }
            ModelSpecifications.Line right = scheme.getRight();
            if (right != null) {
                int from3 = measuredHeight3 + ((int) (i25 * ((right.getFrom() + right.getTo()) / 2)));
                TextView textView11 = this.f84367l;
                if (textView11 == null) {
                    textView11 = null;
                }
                int measuredHeight10 = textView11.getMeasuredHeight();
                TextView textView12 = this.f84367l;
                if (textView12 == null) {
                    textView12 = null;
                }
                int measuredHeight11 = i16 - (measuredHeight10 - (textView12.getMeasuredHeight() / 2));
                TextView textView13 = this.f84367l;
                if (textView13 == null) {
                    textView13 = null;
                }
                a(textView13, measuredHeight11, from3);
                TextView textView14 = this.f84367l;
                if (textView14 == null) {
                    textView14 = null;
                }
                int measuredHeight12 = (i16 - textView14.getMeasuredHeight()) - i18;
                View view5 = this.f84366k;
                if (view5 == null) {
                    view5 = null;
                }
                int measuredWidth2 = view5.getMeasuredWidth();
                View view6 = this.f84366k;
                if (view6 == null) {
                    view6 = null;
                }
                int measuredWidth3 = measuredHeight12 - (measuredWidth2 - (view6.getMeasuredWidth() / 2));
                View view7 = this.f84366k;
                if (view7 == null) {
                    view7 = null;
                }
                a(view7, measuredWidth3, from3);
            }
            ModelSpecifications.Line bottom = scheme.getBottom();
            if (bottom != null) {
                int from4 = measuredHeight + ((int) (i24 * ((bottom.getFrom() + bottom.getTo()) / 2)));
                TextView textView15 = this.f84369n;
                if (textView15 == null) {
                    textView15 = null;
                }
                int measuredHeight13 = textView15.getMeasuredHeight();
                TextView textView16 = this.f84369n;
                if (textView16 == null) {
                    textView16 = null;
                }
                int measuredHeight14 = i17 - (measuredHeight13 - (textView16.getMeasuredHeight() / 2));
                TextView textView17 = this.f84369n;
                if (textView17 == null) {
                    textView17 = null;
                }
                a(textView17, from4, measuredHeight14);
                TextView textView18 = this.f84369n;
                if (textView18 == null) {
                    textView18 = null;
                }
                int measuredHeight15 = (i17 - textView18.getMeasuredHeight()) - i22;
                View view8 = this.f84368m;
                if (view8 == null) {
                    view8 = null;
                }
                int measuredHeight16 = view8.getMeasuredHeight();
                View view9 = this.f84368m;
                if (view9 == null) {
                    view9 = null;
                }
                int measuredHeight17 = measuredHeight15 - (measuredHeight16 - (view9.getMeasuredHeight() / 2));
                View view10 = this.f84368m;
                a(view10 != null ? view10 : null, from4, measuredHeight17);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredHeight;
        Uri uri;
        int i14;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i12);
        ModelSpecifications.Scheme scheme = this.f84374s;
        if ((this.f84370o != size || this.f84372q) && scheme != null) {
            this.f84370o = size;
            this.f84372q = false;
            int i15 = (int) ((this.f84358c + this.f84357b) * size);
            if (scheme.getLeft() != null) {
                TextView textView = this.f84363h;
                if (textView == null) {
                    textView = null;
                }
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                TextView textView2 = this.f84363h;
                if (textView2 == null) {
                    textView2 = null;
                }
                measuredHeight = textView2.getMeasuredHeight() + i15;
            } else {
                measuredHeight = 0;
            }
            if (scheme.getRight() != null) {
                TextView textView3 = this.f84367l;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                TextView textView4 = this.f84367l;
                if (textView4 == null) {
                    textView4 = null;
                }
                measuredHeight += textView4.getMeasuredHeight() + i15;
            }
            int i16 = size - measuredHeight;
            Size size2 = null;
            Size size3 = null;
            for (Size size4 : scheme.getImage().getVariants().keySet()) {
                if (i16 <= size4.getWidth() && (size2 == null || size4.getWidth() < size2.getWidth())) {
                    size2 = size4;
                }
                if (size4.getWidth() <= i16 && (size3 == null || size3.getWidth() < size4.getWidth())) {
                    size3 = size4;
                }
            }
            if (size2 == null) {
                if (size3 == null) {
                    throw new IllegalArgumentException("Image not contains variants");
                }
                size2 = size3;
            }
            uri = scheme.getImage().getVariants().get(size2);
            int height = (int) (((size2.getHeight() * i16) * 1.0f) / size2.getWidth());
            SimpleDraweeView simpleDraweeView = this.f84361f;
            if (simpleDraweeView == null) {
                simpleDraweeView = null;
            }
            simpleDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            ModelSpecifications.Line left = scheme.getLeft();
            if (left != null) {
                float to2 = left.getTo() - left.getFrom();
                View view = this.f84362g;
                if (view == null) {
                    view = null;
                }
                measureChild(view, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec((int) (height * to2), 1073741824));
            }
            ModelSpecifications.Line right = scheme.getRight();
            if (right != null) {
                float to3 = right.getTo() - right.getFrom();
                View view2 = this.f84366k;
                if (view2 == null) {
                    view2 = null;
                }
                measureChild(view2, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec((int) (height * to3), 1073741824));
            }
            ModelSpecifications.Line top = scheme.getTop();
            if (top != null) {
                TextView textView5 = this.f84365j;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                TextView textView6 = this.f84365j;
                if (textView6 == null) {
                    textView6 = null;
                }
                measuredHeight2 = textView6.getMeasuredHeight();
                float to4 = top.getTo() - top.getFrom();
                View view3 = this.f84364i;
                if (view3 == null) {
                    view3 = null;
                }
                measureChild(view3, View.MeasureSpec.makeMeasureSpec((int) (i16 * to4), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = 1;
            } else {
                i14 = 0;
                measuredHeight2 = 0;
            }
            ModelSpecifications.Line bottom = scheme.getBottom();
            if (bottom != null) {
                TextView textView7 = this.f84369n;
                if (textView7 == null) {
                    textView7 = null;
                }
                textView7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                TextView textView8 = this.f84369n;
                if (textView8 == null) {
                    textView8 = null;
                }
                measuredHeight2 += textView8.getMeasuredHeight();
                i14++;
                float to5 = bottom.getTo() - bottom.getFrom();
                View view4 = this.f84368m;
                if (view4 == null) {
                    view4 = null;
                }
                measureChild(view4, View.MeasureSpec.makeMeasureSpec((int) (i16 * to5), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            this.f84371p = (int) ((height + measuredHeight2) / (1 - ((this.f84360e + this.f84359d) * i14)));
        } else {
            uri = null;
        }
        setMeasuredDimension(this.f84370o, this.f84371p);
        if (uri == null || this.f84373r) {
            return;
        }
        this.f84373r = true;
        SimpleDraweeView simpleDraweeView2 = this.f84361f;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView2 != null ? simpleDraweeView2 : null);
        aVarA.d(new p(uri));
        aVarA.c();
    }

    public final void setScheme(@k ModelSpecifications.Scheme scheme) {
        this.f84374s = scheme;
        this.f84372q = true;
        this.f84373r = false;
        TextView textView = this.f84363h;
        if (textView == null) {
            textView = null;
        }
        View view = this.f84362g;
        if (view == null) {
            view = null;
        }
        b(textView, view, scheme.getLeft());
        TextView textView2 = this.f84365j;
        if (textView2 == null) {
            textView2 = null;
        }
        View view2 = this.f84364i;
        if (view2 == null) {
            view2 = null;
        }
        b(textView2, view2, scheme.getTop());
        TextView textView3 = this.f84367l;
        if (textView3 == null) {
            textView3 = null;
        }
        View view3 = this.f84366k;
        if (view3 == null) {
            view3 = null;
        }
        b(textView3, view3, scheme.getRight());
        TextView textView4 = this.f84369n;
        if (textView4 == null) {
            textView4 = null;
        }
        View view4 = this.f84368m;
        b(textView4, view4 != null ? view4 : null, scheme.getBottom());
    }
}
