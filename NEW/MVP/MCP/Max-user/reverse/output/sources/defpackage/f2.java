package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class f2 implements Iterator, my7 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ f2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((i2) this.c).getSize()) {
                }
                break;
            case 1:
                if (this.b < ((float[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 3:
                if (this.b < ((Menu) this.c).size()) {
                }
                break;
            case 4:
                if (this.b > 0) {
                }
                break;
            case 5:
                if (this.b < ((byte[]) this.c).length) {
                }
                break;
            case 6:
                if (this.b < ((int[]) this.c).length) {
                }
                break;
            case 7:
                if (this.b < ((long[]) this.c).length) {
                }
                break;
            case 8:
                if (this.b < ((short[]) this.c).length) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                i2 i2Var = (i2) this.c;
                int i = this.b;
                this.b = i + 1;
                return i2Var.get(i);
            case 1:
                try {
                    float[] fArr = (float[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return Float.valueOf(fArr[i2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                Menu menu = (Menu) this.c;
                int i4 = this.b;
                this.b = i4 + 1;
                MenuItem item = menu.getItem(i4);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            case 4:
                xg5 xg5Var = (xg5) this.c;
                int i5 = xg5Var.c;
                int i6 = this.b;
                this.b = i6 - 1;
                return xg5Var.e[i5 - i6];
            case 5:
                int i7 = this.b;
                byte[] bArr = (byte[]) this.c;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i7 + 1;
                return new fpg(bArr[i7]);
            case 6:
                int i8 = this.b;
                int[] iArr = (int[]) this.c;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i8 + 1;
                return new kpg(iArr[i8]);
            case 7:
                int i9 = this.b;
                long[] jArr = (long[]) this.c;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i9 + 1;
                return new ppg(jArr[i9]);
            case 8:
                int i10 = this.b;
                short[] sArr = (short[]) this.c;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i10 + 1;
                return new upg(sArr[i10]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i11 = this.b;
                this.b = i11 + 1;
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        qqg qqgVar;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                Menu menu = (Menu) this.c;
                int i = this.b - 1;
                this.b = i;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    qqgVar = qqg.a;
                } else {
                    qqgVar = null;
                }
                if (qqgVar == null) {
                    throw new IndexOutOfBoundsException();
                }
                return;
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 8:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i2 = this.b - 1;
                this.b = i2;
                viewGroup.removeViewAt(i2);
                return;
        }
    }

    public f2(xg5 xg5Var) {
        this.a = 4;
        this.c = xg5Var;
        this.b = xg5Var.c;
    }
}
