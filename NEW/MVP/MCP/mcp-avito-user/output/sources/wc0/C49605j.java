package wc0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.mvi.entity.a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import yc0.z;

/* compiled from: SelectionBottomMenu.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc0/j;", "Lwc0/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc0.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49605j implements InterfaceC49603h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f441699a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<z, G0> f441700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f441701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public TextView f441702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public TextView f441703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f441704f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f441705g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public View f441706h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ImageView f441707i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public View f441708j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public View f441709k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public View f441710l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public View f441711m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public View f441712n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public View f441713o;

    /* JADX WARN: Multi-variable type inference failed */
    public C49605j(@Y61.k Context context, @Y61.k Y41.l<? super z, G0> lVar) {
        this.f441699a = context;
        this.f441700b = lVar;
    }

    public final void a(final a.d dVar) {
        SelectionItem selectionItem = dVar.f230680a;
        String str = selectionItem.f229564j;
        if (str == null || C43066x.K(str) || selectionItem.f229567m) {
            View view = this.f441709k;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f441709k;
            if (view2 != null) {
                view2.setOnClickListener(null);
            }
        } else {
            View view3 = this.f441709k;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f441709k;
            if (view4 != null) {
                final int i12 = 0;
                view4.setOnClickListener(new View.OnClickListener(this) { // from class: wc0.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C49605j f441697c;

                    {
                        this.f441697c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        switch (i12) {
                            case 0:
                                this.f441697c.f441700b.invoke(new z.c(dVar.f230680a.f229564j));
                                break;
                            case 1:
                                this.f441697c.f441700b.invoke(new z.j(dVar.f230680a.f229565k));
                                break;
                            case 2:
                                this.f441697c.f441700b.invoke(new z.h(dVar.f230680a));
                                break;
                            case 3:
                                this.f441697c.f441700b.invoke(new z.a(dVar.f230680a));
                                break;
                            default:
                                SelectionItem selectionItem2 = dVar.f230680a;
                                this.f441697c.f441700b.invoke(new z.e(selectionItem2.f229560f, selectionItem2.f229561g));
                                break;
                        }
                    }
                });
            }
        }
        DeepLink deepLink = selectionItem.f229565k;
        boolean z12 = selectionItem.f229567m;
        if (deepLink == null || z12) {
            View view5 = this.f441710l;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.f441710l;
            if (view6 != null) {
                view6.setOnClickListener(null);
            }
        } else {
            View view7 = this.f441710l;
            if (view7 != null) {
                view7.setVisibility(0);
            }
            View view8 = this.f441710l;
            if (view8 != null) {
                final int i13 = 1;
                view8.setOnClickListener(new View.OnClickListener(this) { // from class: wc0.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C49605j f441697c;

                    {
                        this.f441697c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view52) {
                        switch (i13) {
                            case 0:
                                this.f441697c.f441700b.invoke(new z.c(dVar.f230680a.f229564j));
                                break;
                            case 1:
                                this.f441697c.f441700b.invoke(new z.j(dVar.f230680a.f229565k));
                                break;
                            case 2:
                                this.f441697c.f441700b.invoke(new z.h(dVar.f230680a));
                                break;
                            case 3:
                                this.f441697c.f441700b.invoke(new z.a(dVar.f230680a));
                                break;
                            default:
                                SelectionItem selectionItem2 = dVar.f230680a;
                                this.f441697c.f441700b.invoke(new z.e(selectionItem2.f229560f, selectionItem2.f229561g));
                                break;
                        }
                    }
                });
            }
        }
        if (selectionItem.f229562h == null) {
            View view9 = this.f441708j;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            View view10 = this.f441708j;
            if (view10 != null) {
                view10.setOnClickListener(null);
            }
        } else {
            View view11 = this.f441708j;
            if (view11 != null) {
                view11.setVisibility(0);
            }
            View view12 = this.f441708j;
            if (view12 != null) {
                final int i14 = 2;
                view12.setOnClickListener(new View.OnClickListener(this) { // from class: wc0.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C49605j f441697c;

                    {
                        this.f441697c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view52) {
                        switch (i14) {
                            case 0:
                                this.f441697c.f441700b.invoke(new z.c(dVar.f230680a.f229564j));
                                break;
                            case 1:
                                this.f441697c.f441700b.invoke(new z.j(dVar.f230680a.f229565k));
                                break;
                            case 2:
                                this.f441697c.f441700b.invoke(new z.h(dVar.f230680a));
                                break;
                            case 3:
                                this.f441697c.f441700b.invoke(new z.a(dVar.f230680a));
                                break;
                            default:
                                SelectionItem selectionItem2 = dVar.f230680a;
                                this.f441697c.f441700b.invoke(new z.e(selectionItem2.f229560f, selectionItem2.f229561g));
                                break;
                        }
                    }
                });
            }
        }
        TextView textView = this.f441702d;
        ModerationStatus moderationStatus = selectionItem.f229566l;
        if (textView != null) {
            String f226770b = moderationStatus != null ? moderationStatus.getF226770b() : null;
            if (moderationStatus instanceof ModerationStatus.ModerationPassed) {
                f226770b = null;
            }
            I5.a(textView, f226770b, false);
        }
        TextView textView2 = this.f441703e;
        if (textView2 != null) {
            AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
            if (moderationStatus instanceof ModerationStatus.ModerationPassed) {
                f226771c = null;
            }
            com.avito.android.util.text.j.a(textView2, f226771c, null);
        }
        View view13 = this.f441704f;
        Boolean bool = selectionItem.f229568n;
        if (view13 != null) {
            view13.setVisibility((bool == null || z12) ? 8 : 0);
        }
        View view14 = this.f441704f;
        boolean z13 = dVar.f230682c;
        if (view14 != null) {
            view14.setEnabled(!z13);
        }
        View view15 = this.f441706h;
        if (view15 != null) {
            view15.setVisibility(z13 ? 0 : 8);
        }
        ImageView imageView = this.f441707i;
        if (imageView != null) {
            imageView.setVisibility(!z13 ? 0 : 8);
        }
        ImageView imageView2 = this.f441707i;
        if (imageView2 != null) {
            imageView2.setImageResource(L.f(bool, Boolean.TRUE) ? R.drawable.ic_text_public : R.drawable.ic_text_non_public);
        }
        TextView textView3 = this.f441705g;
        if (textView3 != null) {
            textView3.setText(L.f(bool, Boolean.TRUE) ? R.string.extended_profile_settings_selection_public : R.string.extended_profile_settings_selection_non_public);
        }
        View view16 = this.f441704f;
        if (view16 != null) {
            final int i15 = 3;
            view16.setOnClickListener(new View.OnClickListener(this) { // from class: wc0.i

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C49605j f441697c;

                {
                    this.f441697c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view52) {
                    switch (i15) {
                        case 0:
                            this.f441697c.f441700b.invoke(new z.c(dVar.f230680a.f229564j));
                            break;
                        case 1:
                            this.f441697c.f441700b.invoke(new z.j(dVar.f230680a.f229565k));
                            break;
                        case 2:
                            this.f441697c.f441700b.invoke(new z.h(dVar.f230680a));
                            break;
                        case 3:
                            this.f441697c.f441700b.invoke(new z.a(dVar.f230680a));
                            break;
                        default:
                            SelectionItem selectionItem2 = dVar.f230680a;
                            this.f441697c.f441700b.invoke(new z.e(selectionItem2.f229560f, selectionItem2.f229561g));
                            break;
                    }
                }
            });
        }
        View view17 = this.f441711m;
        boolean z14 = dVar.f230681b;
        if (view17 != null) {
            view17.setEnabled(!z14);
        }
        View view18 = this.f441712n;
        if (view18 != null) {
            view18.setVisibility(z14 ? 0 : 8);
        }
        View view19 = this.f441713o;
        if (view19 != null) {
            view19.setVisibility(z14 ? 8 : 0);
        }
        View view20 = this.f441711m;
        if (view20 != null) {
            final int i16 = 4;
            view20.setOnClickListener(new View.OnClickListener(this) { // from class: wc0.i

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C49605j f441697c;

                {
                    this.f441697c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view52) {
                    switch (i16) {
                        case 0:
                            this.f441697c.f441700b.invoke(new z.c(dVar.f230680a.f229564j));
                            break;
                        case 1:
                            this.f441697c.f441700b.invoke(new z.j(dVar.f230680a.f229565k));
                            break;
                        case 2:
                            this.f441697c.f441700b.invoke(new z.h(dVar.f230680a));
                            break;
                        case 3:
                            this.f441697c.f441700b.invoke(new z.a(dVar.f230680a));
                            break;
                        default:
                            SelectionItem selectionItem2 = dVar.f230680a;
                            this.f441697c.f441700b.invoke(new z.e(selectionItem2.f229560f, selectionItem2.f229561g));
                            break;
                    }
                }
            });
        }
    }
}
