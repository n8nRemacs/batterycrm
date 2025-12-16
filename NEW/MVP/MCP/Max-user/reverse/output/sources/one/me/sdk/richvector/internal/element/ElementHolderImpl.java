package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import defpackage.fni;
import defpackage.ue3;
import defpackage.ve3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lone/me/sdk/richvector/internal/element/ElementHolderImpl;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "<init>", "()V", "prototype", "(Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "Lone/me/sdk/richvector/internal/element/GroupElement;", "element", "Lqqg;", "addGroup", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lone/me/sdk/richvector/internal/element/PathElement;", "addPath", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addClipPath", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "", "ratio", "scaleAllStrokeWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", SdkMetricStatEvent.NAME_KEY, "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/PathElement;", "findGroup", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/GroupElement;", "findClipPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/ClipPathElement;", "Ljava/util/ArrayList;", "groupElements", "Ljava/util/ArrayList;", "getGroupElements", "()Ljava/util/ArrayList;", "pathElements", "getPathElements", "", "clipPathElements", "Ljava/util/List;", "getClipPathElements", "()Ljava/util/List;", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ElementHolderImpl implements ElementHolder {
    private final List<ClipPathElement> clipPathElements;
    private final ArrayList<GroupElement> groupElements;
    private final ArrayList<PathElement> pathElements;

    public ElementHolderImpl() {
        this.groupElements = new ArrayList<>(2);
        this.pathElements = new ArrayList<>(3);
        this.clipPathElements = new ArrayList();
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addClipPath(ClipPathElement element) {
        getClipPathElements().add(element);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addGroup(GroupElement element) {
        getGroupElements().add(element);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addPath(PathElement element) {
        getPathElements().add(element);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void draw(Canvas canvas) {
        List<ClipPathElement> clipPathElements = getClipPathElements();
        int i = ve3.i(clipPathElements);
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                Object objJ = ue3.J(i3, clipPathElements);
                if (objJ != null) {
                    canvas.clipPath(((ClipPathElement) objJ).getPath());
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList<GroupElement> groupElements = getGroupElements();
        int i4 = ve3.i(groupElements);
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                Object objJ2 = ue3.J(i5, groupElements);
                if (objJ2 != null) {
                    ((GroupElement) objJ2).draw(canvas);
                }
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        ArrayList<PathElement> pathElements = getPathElements();
        int i6 = ve3.i(pathElements);
        if (i6 < 0) {
            return;
        }
        while (true) {
            Object objJ3 = ue3.J(i2, pathElements);
            if (objJ3 != null) {
                ((PathElement) objJ3).draw(canvas);
            }
            if (i2 == i6) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public ClipPathElement findClipPath(String name) {
        Object next;
        Iterator<T> it = getClipPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((ClipPathElement) next).getName(), name)) {
                break;
            }
        }
        ClipPathElement clipPathElement = (ClipPathElement) next;
        if (clipPathElement != null) {
            return clipPathElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            ClipPathElement clipPathElementFindClipPath = ((GroupElement) it2.next()).findClipPath(name);
            if (clipPathElementFindClipPath != null) {
                return clipPathElementFindClipPath;
            }
        }
        return null;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public GroupElement findGroup(String name) {
        Object next;
        Iterator<T> it = getGroupElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((GroupElement) next).getName(), name)) {
                break;
            }
        }
        GroupElement groupElement = (GroupElement) next;
        if (groupElement != null) {
            return groupElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            GroupElement groupElementFindGroup = ((GroupElement) it2.next()).findGroup(name);
            if (groupElementFindGroup != null) {
                return groupElementFindGroup;
            }
        }
        return null;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public PathElement findPath(String name) {
        Object next;
        Iterator<T> it = getPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((PathElement) next).getName(), name)) {
                break;
            }
        }
        PathElement pathElement = (PathElement) next;
        if (pathElement != null) {
            return pathElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            PathElement pathElementFindPath = ((GroupElement) it2.next()).findPath(name);
            if (pathElementFindPath != null) {
                return pathElementFindPath;
            }
        }
        return null;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public List<ClipPathElement> getClipPathElements() {
        return this.clipPathElements;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void scaleAllStrokeWidth(float ratio) {
        ArrayList<GroupElement> groupElements = getGroupElements();
        int i = ve3.i(groupElements);
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                Object objJ = ue3.J(i3, groupElements);
                if (objJ != null) {
                    ((GroupElement) objJ).scaleAllStrokeWidth(ratio);
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList<PathElement> pathElements = getPathElements();
        int i4 = ve3.i(pathElements);
        if (i4 < 0) {
            return;
        }
        while (true) {
            Object objJ2 = ue3.J(i2, pathElements);
            if (objJ2 != null) {
                ((PathElement) objJ2).setStrokeRatio(ratio);
            }
            if (i2 == i4) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public ArrayList<GroupElement> getGroupElements() {
        return this.groupElements;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public ArrayList<PathElement> getPathElements() {
        return this.pathElements;
    }

    public ElementHolderImpl(ElementHolder elementHolder) {
        this();
        List<GroupElement> groupElements = elementHolder.getGroupElements();
        int i = ve3.i(groupElements);
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                Object objJ = ue3.J(i3, groupElements);
                if (objJ != null) {
                    getGroupElements().add(new GroupElement((GroupElement) objJ, null, 2, null));
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List<PathElement> pathElements = elementHolder.getPathElements();
        int i4 = ve3.i(pathElements);
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                Object objJ2 = ue3.J(i5, pathElements);
                if (objJ2 != null) {
                    getPathElements().add(new PathElement((PathElement) objJ2));
                }
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        List<ClipPathElement> clipPathElements = elementHolder.getClipPathElements();
        int i6 = ve3.i(clipPathElements);
        if (i6 < 0) {
            return;
        }
        while (true) {
            Object objJ3 = ue3.J(i2, clipPathElements);
            if (objJ3 != null) {
                getClipPathElements().add(new ClipPathElement((ClipPathElement) objJ3));
            }
            if (i2 == i6) {
                return;
            } else {
                i2++;
            }
        }
    }
}
