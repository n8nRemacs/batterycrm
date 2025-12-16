package YU;

import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DescriptionParameterItem f19479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19480d;

    public /* synthetic */ a(DescriptionParameterItem descriptionParameterItem, int i12, int i13) {
        this.f19478b = i13;
        this.f19479c = descriptionParameterItem;
        this.f19480d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19478b) {
            case 0:
                D6.m(this.f19479c.icon, this.f19480d);
                break;
            default:
                D6.m(this.f19479c.icon, this.f19480d);
                break;
        }
    }
}
